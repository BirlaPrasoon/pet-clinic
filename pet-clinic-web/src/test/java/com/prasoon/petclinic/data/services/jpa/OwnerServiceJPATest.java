package com.prasoon.petclinic.data.services.jpa;

import com.prasoon.petclinic.data.model.Owner;
import com.prasoon.petclinic.data.repositories.OwnerRepository;
import com.prasoon.petclinic.data.repositories.PetRepository;
import com.prasoon.petclinic.data.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerServiceJPATest {

    public static final String BIRLA = "Birla";
    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerServiceJPA ownerServiceJPA;

    @BeforeEach void setUp() {

    }

    @Test void findByLastName() {

        Owner owner = new Owner();
        owner.setId(1L);
        owner.setLastName(BIRLA);
        ArrayList<Owner> ownerList = new ArrayList<>();
        ownerList.add(owner);
        when(ownerServiceJPA.findByLastName(any())).thenReturn(ownerList);

        Owner Prasoon = ownerServiceJPA.findByLastName(BIRLA).get(0);
        assertEquals(BIRLA, Prasoon.getLastName());

    }

    @Test void findAll() {
        System.out.println(ownerServiceJPA.findAll());
    }

    @Test void findById() {
    }

    @Test void save() {
    }

    @Test void deleteById() {
    }
}