package fr.diginamic.Spring_Data_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import fr.diginamic.Spring_Data_JPA.enums.Sex;
// import fr.diginamic.Spring_Data_JPA.model.Animal;
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
		// Effectuez des opérations de démarrage ici
		System.out.println("L'application démarre.");

		// Annimal Repository
		animalRepository.findAll().forEach(System.out::println);

		// Person Repository
		personRepository.findAll().forEach(System.out::println);

		// Species Repository
		speciesRepository.findAll().forEach(System.out::println);

		// // Créer un animal
		// Animal animal = new Animal();
		// animal.setName("Toto");
		// animal.setColor("Rouge");
		// animal.setSex(Sex.M);
		// animal.setSpecies(speciesRepository.findById(1).get());
		// animalRepository.save(animal);

		// // Supprimer un animal
		// personRepository.deleteById(1);

		// Retrouver une espèce par son nom (avec la méthode findByCommonName)
		System.out.println(speciesRepository.findFirstByCommonName("Chien"));
		System.out.println(speciesRepository.findBylatinNameContainsIgnoreCase("canis"));

	}

}
