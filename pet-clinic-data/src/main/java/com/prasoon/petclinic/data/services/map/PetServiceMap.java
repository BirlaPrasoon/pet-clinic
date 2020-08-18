package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.Pet;
import com.prasoon.petclinic.data.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends CrudServiceMapImpl<Pet, Long> implements
        PetService {
}
