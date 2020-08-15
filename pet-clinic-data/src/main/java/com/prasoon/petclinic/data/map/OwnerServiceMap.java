package com.prasoon.petclinic.data.map;

import com.prasoon.petclinic.data.model.Owner;
import com.prasoon.petclinic.data.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerServiceMap extends CrudServiceMapImpl<Owner, Long> implements OwnerService {

    @Override public List<Owner> findByLastName(String lastName) {
        return this.map.values().parallelStream()
                .filter(owner -> owner.getLastName().equals(lastName))
                .collect(Collectors.toList());
    }

}
