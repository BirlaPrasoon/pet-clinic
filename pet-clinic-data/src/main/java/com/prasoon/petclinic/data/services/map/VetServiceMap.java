package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.Vet;
import com.prasoon.petclinic.data.services.SpecialityService;
import com.prasoon.petclinic.data.services.VetService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends CrudServiceMapImpl<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override public Vet save(@NonNull Vet object) {
        if(object != null){
            if(object.getSpecialities().size()>0){
                object.getSpecialities().forEach(speciality -> {
                    if(speciality.getId() == null){
                        speciality.setId(specialityService.save(speciality).getId());
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
