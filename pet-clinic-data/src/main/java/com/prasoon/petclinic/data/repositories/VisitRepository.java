package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
