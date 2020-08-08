package com.prasoon.petclinic.data.services;

import com.prasoon.petclinic.data.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    List<Owner> findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
