package com.prasoon.petclinic.data.services;

import com.prasoon.petclinic.data.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
