package fr.diginamic.Spring_Data_JPA.model;

import jakarta.persistence.*;

@Entity
public class Species {

    // ------------------------- Attributes -------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String common_name;

    private String latin_name;

    // ------------------------- Constructors -------------------------
    public Species() {
    }

    // ------------------------- Getters & Setters -------------------------

    public String getCommon_name() {
        return common_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public String getLatin_name() {
        return latin_name;
    }

    public void setLatin_name(String latin_name) {
        this.latin_name = latin_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
