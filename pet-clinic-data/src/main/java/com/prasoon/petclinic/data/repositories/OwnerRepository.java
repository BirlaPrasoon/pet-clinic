package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
