package com.prasoon.petclinic.data.services.jpa;

import com.prasoon.petclinic.data.model.Vet;
import com.prasoon.petclinic.data.repositories.VetRepository;
import com.prasoon.petclinic.data.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
@Profile("springdatajpa")
public class VetServiceJPA implements VetService {

    private final VetRepository vetRepository;

    public VetServiceJPA(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override public Collection<Vet> findAll() {
        Collection<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
