package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.Owner;
import com.prasoon.petclinic.data.model.Pet;
import com.prasoon.petclinic.data.services.OwnerService;
import com.prasoon.petclinic.data.services.PetService;
import com.prasoon.petclinic.data.services.PetTypeService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerServiceMap extends CrudServiceMapImpl<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return this.map.values().parallelStream()
                .filter(owner -> owner.getLastName().equals(lastName))
                .collect(Collectors.toList());
    }

    @Override public Owner save(@NonNull Owner object) {
        if(object != null){
            if(object.getPets()!=null){
                object.getPets().forEach(pet ->{
                    if(pet.getPetType()!=null){
                        petTypeService.save(pet.getPetType());
                    }else{
                        throw new RuntimeException("Pet Type is required");
                    }
                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        } else{
            throw new RuntimeException("Object can not be null");
        }
        return object;
    }
}
