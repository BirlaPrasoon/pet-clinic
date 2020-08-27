package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    List<Owner> findByLastName(String lastName);


}
