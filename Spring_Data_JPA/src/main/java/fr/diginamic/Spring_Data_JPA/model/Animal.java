package fr.diginamic.Spring_Data_JPA.model;

import java.util.List;

import fr.diginamic.Spring_Data_JPA.enums.Sex;
import jakarta.persistence.*;

@Entity
public class Animal {

    // ------------------------- Attributes -------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String color;

    private String name;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @ManyToOne
    @JoinColumn(name = "species_id")
    private Species species;

    @ManyToMany(mappedBy = "animals")
    private List<Person> person;

    // ------------------------- Constructors -------------------------
    public Animal() {
    }

    // ------------------------- Getters & Setters -------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", species=" + species +
                '}';
    }
}