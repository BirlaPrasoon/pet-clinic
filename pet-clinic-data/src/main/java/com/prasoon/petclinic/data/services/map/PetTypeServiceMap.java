package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.PetType;
import com.prasoon.petclinic.data.services.CrudService;
import com.prasoon.petclinic.data.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Profile({"default", "map"})
public class PetTypeServiceMap extends CrudServiceMapImpl<PetType, Long> implements
        PetTypeService{

}
