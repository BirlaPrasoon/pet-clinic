package com.prasoon.petclinic.data.model;

import com.prasoon.petclinic.data.model.Person;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialities;

    public Vet() {
        this.specialities = new HashSet<>();
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

    @Override public String toString() {
        return "Vet{" + "specialities=" + specialities + '}';
    }
}
