package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.Visit;
import com.prasoon.petclinic.data.services.VisitService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceMapImpl extends CrudServiceMapImpl<Visit, Long> implements
        VisitService {

    @Override public Visit save(@NonNull Visit visit) {
        if (visit.getPet() == null || visit.getPet().getId() == null
                || visit.getPet().getOwner() == null
                || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }
}
