package com.prasoon.petclinic.web.bootstarp;

import com.prasoon.petclinic.data.model.*;
import com.prasoon.petclinic.data.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService,
            PetTypeService petTypeService, PetService petService,
            SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0){
            loadData();
        }
        System.out.println("PETS: " + petService.findAll());
        System.out.println("PET TYPES: "+ petTypeService.findAll());
        System.out.println("SPECIALITIES: "+ specialityService.findAll());
        System.out.println("OWNERS: " + ownerService.findAll());
        System.out.println("VETS: "+ vetService.findAll());
    }

    private void loadData() {
        PetType dog= new PetType();
        dog.setName("Dog");
        dog.setId(1L);

        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        dog.setId(2L);

        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setId(92L);
        radiology.setDescription("Radiology...");

        Speciality surgery = new Speciality();
        surgery.setId(29L);
        surgery.setDescription("Surgery...");

        specialityService.save(radiology);
        specialityService.save(surgery);

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("2611/194, Onkar Nagar Tri Nagar");
        owner1.setCity("Delhi");
        owner1.setTelephone("82459872349");

        Pet mikesPet = new Pet();
        mikesPet.setId(23L);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setOwner(owner1);
        mikesPet.setName("Fluffy");
        mikesPet.setPetType(dog);
        owner1.getPets().add(mikesPet);

        petService.save(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("2611/194, Onkar Nagar Tri Nagar");
        owner2.setCity("Delhi");
        owner2.setTelephone("82459872349");

        Pet fionasCat = new Pet();
        fionasCat.setId(27L);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setOwner(owner2);
        fionasCat.setName("Furry");
        fionasCat.setPetType(cat);
        owner2.getPets().add(fionasCat);
        petService.save(fionasCat);
        ownerService.save(owner2);

        Vet vet1 = new Vet();

        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(radiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setLastName("Porter");
        vet2.setFirstName("Jessie");
        vet2.getSpecialities().add(surgery);
        vetService.save(vet2);

    }

}
