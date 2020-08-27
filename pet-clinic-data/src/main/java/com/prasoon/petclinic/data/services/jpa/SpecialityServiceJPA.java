package com.prasoon.petclinic.data.services.jpa;

import com.prasoon.petclinic.data.model.Speciality;
import com.prasoon.petclinic.data.repositories.SpecialityRepository;
import com.prasoon.petclinic.data.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
@Profile("springdatajpa")
public class SpecialityServiceJPA implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityServiceJPA(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override public Collection<Speciality> findAll() {
        Collection<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
