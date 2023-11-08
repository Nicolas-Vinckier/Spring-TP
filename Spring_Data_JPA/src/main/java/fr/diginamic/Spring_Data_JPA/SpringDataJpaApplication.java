package fr.diginamic.Spring_Data_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import fr.diginamic.Spring_Data_JPA.enums.Sex;
import fr.diginamic.Spring_Data_JPA.repository.*;
import jakarta.transaction.Transactional;

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

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		// Effectuez des opérations de démarrage ici
		System.out.println("L'application démarre.");

		// Annimal Repository
		animalRepository.findAll().forEach(System.out::println);

		// Person Repository
		personRepository.findAll().forEach(System.out::println);

		// Species Repository
		speciesRepository.findAll().forEach(System.out::println);

	}
}
