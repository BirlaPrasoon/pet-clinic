package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
