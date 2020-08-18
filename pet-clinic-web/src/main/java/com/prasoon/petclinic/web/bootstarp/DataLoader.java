package com.prasoon.petclinic.web.bootstarp;

import com.prasoon.petclinic.data.model.Owner;
import com.prasoon.petclinic.data.model.Pet;
import com.prasoon.petclinic.data.model.PetType;
import com.prasoon.petclinic.data.model.Vet;
import com.prasoon.petclinic.data.services.OwnerService;
import com.prasoon.petclinic.data.services.PetService;
import com.prasoon.petclinic.data.services.PetTypeService;
import com.prasoon.petclinic.data.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService,
            PetTypeService petTypeService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog= new PetType();
        dog.setName("Dog");
        dog.setId(1L);

        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        dog.setId(2L);

        PetType savedCatPetType = petTypeService.save(cat);

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

        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();

        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setLastName("Porter");
        vet2.setFirstName("Jessie");

        vetService.save(vet2);

        System.out.println("Loaded Vets ....");
    }

}
