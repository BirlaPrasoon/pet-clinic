package com.prasoon.petclinic.data.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="owners")
@Getter
@Setter
@AllArgsConstructor
@ToString(exclude = "pets")
@EqualsAndHashCode(callSuper = true, exclude = "pets")
public class Owner extends Person {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets ;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    public Owner() {
        this.pets = new HashSet<>();
    }

}
