package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
