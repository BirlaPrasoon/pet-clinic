package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
