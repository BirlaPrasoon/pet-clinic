package com.prasoon.petclinic.data.model;

import lombok.Builder;

public class Owner extends Person {

    public Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Owner(){

    }
}
