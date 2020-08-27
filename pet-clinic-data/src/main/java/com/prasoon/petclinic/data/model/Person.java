package com.prasoon.petclinic.data.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity {

    @Column(name="first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

}
