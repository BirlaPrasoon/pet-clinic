package com.prasoon.petclinic.data.services;

import com.prasoon.petclinic.data.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();

}
