package com.prasoon.petclinic.data.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
@Getter
@Setter
@AllArgsConstructor
@ToString(exclude = "pet")
@EqualsAndHashCode(callSuper = true, exclude = "pet")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public Visit(){
        this.date = LocalDate.now();
    }

}
