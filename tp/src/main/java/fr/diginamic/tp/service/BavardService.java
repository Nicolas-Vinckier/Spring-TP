package fr.diginamic.tp.service;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class BavardService {
    private String nom = "Baguette";

    public BavardService() {
        // Constructeur par défaut
    }

    public void parler() {
        System.out.println(nom + " -> " + this.getClass().getSimpleName());
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("PostConstruct");
    }
}
