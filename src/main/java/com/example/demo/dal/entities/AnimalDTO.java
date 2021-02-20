package com.example.demo.dal.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor // minden argumentummla konstruktor
@NoArgsConstructor // ures konstruktor
@EqualsAndHashCode(callSuper = true) // legenerálja
@Table(name = "animalsDTO") // tábla elnevezés
public class AnimalDTO extends BaseEntity {

    private String name;

    private int animaltype_id;

    private String virtual_owner; // int

    private String breed;

    private int gender;

    public int age;

    @Lob
    private String lifestory;

    @Lob
    private String imagine;

    private int shelter_id;
}
