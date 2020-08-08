package com.prasoon.petclinic.data.services;

import com.prasoon.petclinic.data.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{

    List<Owner> findByLastName(String lastName);

}
