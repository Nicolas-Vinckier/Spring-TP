package fr.diginamic.Spring_Data_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.diginamic.Spring_Data_JPA.repository.*;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {
	@Autowired
	private AnimalRepository animalRepository;

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private SpeciesRepository speciesRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Toutes les personnes : " + personRepository.findAll());
		System.out.println("Tous les animaux : " + animalRepository.findAll());
		System.out.println("Toutes les espèces : " + speciesRepository.findAll());
	}
}
