package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.Pet;
import com.prasoon.petclinic.data.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetServiceMap extends CrudServiceMapImpl<Pet, Long> implements
        PetService {
}
