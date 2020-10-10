package com.prasoon.petclinic.data.services.map;

import com.prasoon.petclinic.data.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;


class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;


    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());

        Owner owner = new Owner();
        owner.setId(1L);
        owner.setLastName("Birla");
        owner.setFirstName("Prasoon");
        ownerServiceMap.save(owner);
    }

    @Test
    void findByLastName() {
        assertEquals(1,ownerServiceMap.findByLastName("Birla").get(0).getId());
    }

    @Test
    void save() {
        Owner newOwner = new Owner();
        newOwner.setId(2L);
        newOwner.setFirstName("Prasoon");
        ownerServiceMap.save(newOwner);
        assertEquals(2, ownerServiceMap.findAll().size());
    }

    @Test
    void findById(){
        assertEquals("Prasoon", ownerServiceMap.findById(1L).getFirstName());
    }

    @Test
    void findAll(){
        assertEquals(1, ownerServiceMap.findAll().size());
    }

    @Test
    void deleteById(){
        ownerServiceMap.deleteById(1l);
        assertEquals(0, ownerServiceMap.findAll().size());
    }
}