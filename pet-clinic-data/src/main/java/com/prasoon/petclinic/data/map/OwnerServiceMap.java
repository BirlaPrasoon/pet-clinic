package com.prasoon.petclinic.data.map;

import com.prasoon.petclinic.data.model.Owner;
import com.prasoon.petclinic.data.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {



    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
