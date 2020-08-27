package com.prasoon.petclinic.data.services.jpa;

import com.prasoon.petclinic.data.model.Pet;
import com.prasoon.petclinic.data.repositories.PetRepository;
import com.prasoon.petclinic.data.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
@Profile("springdatajpa")
public class PetServiceJPA implements PetService {

    private final PetRepository petRepository;

    public PetServiceJPA(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override public Collection<Pet> findAll() {
        Collection<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
