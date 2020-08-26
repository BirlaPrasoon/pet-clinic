package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
