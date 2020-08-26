package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
