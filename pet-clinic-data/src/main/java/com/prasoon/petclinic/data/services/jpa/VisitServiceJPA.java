package com.prasoon.petclinic.data.services.jpa;

import com.prasoon.petclinic.data.model.Visit;
import com.prasoon.petclinic.data.repositories.VisitRepository;
import com.prasoon.petclinic.data.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
@Profile("springdatajpa")
public class VisitServiceJPA implements VisitService {

    private final VisitRepository visitRepository;

    public VisitServiceJPA(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override public Collection<Visit> findAll() {
        Collection<Visit> collection = new HashSet<>();
        visitRepository.findAll().forEach(collection::add);
        return collection;
    }

    @Override public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
