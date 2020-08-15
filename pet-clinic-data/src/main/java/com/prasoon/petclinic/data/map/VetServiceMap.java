package com.prasoon.petclinic.data.map;

import com.prasoon.petclinic.data.model.Vet;
import com.prasoon.petclinic.data.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends CrudServiceMapImpl<Vet, Long> implements VetService {
}
