package com.prasoon.petclinic.data.repositories;

import com.prasoon.petclinic.data.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}
