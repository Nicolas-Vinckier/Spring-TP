package fr.diginamic.Spring_Data_JPA.model;

import jakarta.persistence.*;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "species_id")
    private Species species;

    @ManyToOne
    @JoinColumn(name = "personne_id")
    private Person personne;

    public Animal() {
    }

    public Animal(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    public Animal(Long id, String name, Species species) {
        this(name, species);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Species getSpecies() {

        return species;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSpecies(Species species) {

        this.species = species;
    }

    public Person getPersonne() {
        return personne;
    }

    public void setPersonne(Person personne) {
        this.personne = personne;
    }

    @Override
    public String toString() {
        return "Animal [id=" + id + ", name=" + name + ", species=" + species
                + "]";
    }

}
