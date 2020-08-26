package com.prasoon.petclinic.data.services.jpa;

import com.prasoon.petclinic.data.model.PetType;
import com.prasoon.petclinic.data.repositories.PetTypeRepository;
import com.prasoon.petclinic.data.services.PetTypeService;

import java.util.Collection;
import java.util.HashSet;

public class PetTypeServiceJPA implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeServiceJPA(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Collection<PetType> findAll() {
        Collection<PetType> collection = new HashSet<>();
        petTypeRepository.findAll().forEach(collection::add);
        return collection;
    }

    @Override public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
