package com.prasoon.petclinic.data.services.jpa;

import com.prasoon.petclinic.data.model.Pet;
import com.prasoon.petclinic.data.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
@Profile("springdatajpa")
public class PetServiceJPA implements PetService {

    private final PetService petService;

    public PetServiceJPA(PetService petService) {
        this.petService = petService;
    }

    @Override public Collection<Pet> findAll() {
        Collection<Pet> pets = new HashSet<>();
        petService.findAll().forEach(pets::add);
        return pets;
    }

    @Override public Pet findById(Long aLong) {
        return petService.findById(aLong);
    }

    @Override public Pet save(Pet object) {
        return petService.save(object);
    }

    @Override public void deleteById(Long aLong) {
        petService.deleteById(aLong);
    }
}
