package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.Speciality;
import com.prasoon.petclinic.data.services.SpecialitiesService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityServiceMapImpl extends CrudServiceMapImpl<Speciality, Long> implements
        SpecialitiesService {
}
