package com.prasoon.petclinic.data.model;

import com.prasoon.petclinic.data.model.Person;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
@Getter
@Setter
@AllArgsConstructor
@ToString(exclude = "specialities")
@EqualsAndHashCode(callSuper = true, exclude = "specialities")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities",
            joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities;

    public Vet() {
        this.specialities = new HashSet<>();
    }


}
