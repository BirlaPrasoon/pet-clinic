package com.prasoon.petclinic.web.bootstarp;

import com.prasoon.petclinic.data.map.OwnerServiceMap;
import com.prasoon.petclinic.data.map.VetServiceMap;
import com.prasoon.petclinic.data.model.Owner;
import com.prasoon.petclinic.data.model.Vet;
import com.prasoon.petclinic.data.services.OwnerService;
import com.prasoon.petclinic.data.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader (){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1.getId(),owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2.getId(), owner2);

        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();

        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1.getId(), vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setLastName("Porter");
        vet2.setFirstName("Jessie");

        vetService.save(vet2.getId(), vet2);

        System.out.println("Loaded Vets ....");

    }

}