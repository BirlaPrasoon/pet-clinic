package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    List<Owner> findByLastName(String lastName);


}
