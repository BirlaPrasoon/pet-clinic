package com.prasoon.petclinic.data.services.jpa;

import com.prasoon.petclinic.data.model.Owner;
import com.prasoon.petclinic.data.repositories.OwnerRepository;
import com.prasoon.petclinic.data.repositories.PetRepository;
import com.prasoon.petclinic.data.repositories.PetTypeRepository;
import com.prasoon.petclinic.data.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Profile("springdatajpa")
public class OwnerServiceJPA implements OwnerService {

    @Autowired
    private final OwnerRepository ownerRepository;

    @Autowired
    private final PetRepository petRepository;

    @Autowired
    private final PetTypeRepository petTypeRepositor;

    public OwnerServiceJPA(OwnerRepository ownerRepository,
            PetRepository petRepository, PetTypeRepository petTypeRepositor) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepositor = petTypeRepositor;
    }

    @Override public List<Owner> findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override public Collection<Owner> findAll() {
        Collection<Owner> collection = new HashSet<>();
        ownerRepository.findAll().forEach(collection::add);
        return collection;
    }

    @Override public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
