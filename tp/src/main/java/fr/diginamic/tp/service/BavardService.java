package fr.diginamic.tp.service;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class BavardService {
    // private String nom = "Baguette";

    public BavardService() {
        // Constructeur par défaut
    }

    // Getter & setter
    // public String getNom() {
    // return nom;
    // }

    // public void setNom(String nom) {
    // this.nom = nom;
    // }

    public String parler(String nom) {
        System.out.println(nom + " -> " + this.getClass().getSimpleName());
        return nom + " -> " + this.getClass().getSimpleName();
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("PostConstruct");
    }
}
