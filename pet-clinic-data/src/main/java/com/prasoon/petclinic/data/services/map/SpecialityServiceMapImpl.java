package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.Speciality;
import com.prasoon.petclinic.data.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialityServiceMapImpl extends CrudServiceMapImpl<Speciality, Long> implements
        SpecialityService {
}
