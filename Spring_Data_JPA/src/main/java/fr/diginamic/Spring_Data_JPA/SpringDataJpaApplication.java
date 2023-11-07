package fr.diginamic.Spring_Data_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import fr.diginamic.Spring_Data_JPA.enums.Sex;
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

		// // Retrouver une espèce par son nom (avec la méthode findByCommonName)
		// System.out.println(speciesRepository.findFirstByCommonName("Chien"));
		// System.out.println(speciesRepository.findBylatinNameContainsIgnoreCase("canis"));

		// // Retrouver des humains par leur nom ou prénom (avec la méthode
		// // findFirstByLastNameOrFirstName)
		// System.out.println(personRepository.findFirstByLastnameOrFirstname("Doe",
		// "Bill"));

		// // Retrouver des humains par leur âge (avec la méthode
		// // findByAgeGreaterThanEqual)
		// System.out.println(personRepository.findByAgeGreaterThanEqual(50));

		// // Retrouver des animaux par leur espèce (avec la méthode findBySpeciesId)
		// System.out.println(animalRepository.findBySpecies(speciesRepository.findById(1).get()));

		// // Retrouver des animaux par leur couleur (avec la méthode findByColor)
		// System.out.println(animalRepository.findByColor("Roux"));

		// // Avec la méthode findAllByOrderByCommonNameAsc (qui utilise une Query),
		// // retournez toutes les espèces triées par ordre alphabétique de nom commun.
		// System.out.println("===================== findAllByOrderByCommonNameAsc
		// =====================");
		// System.out.println(speciesRepository.findAllByOrderByCommonNameAsc());
		// System.out.println("=========================================================================");

		// // Avec la méthode findByCommonNameLike (qui utilise une Query), retournez
		// // toutes les espèces dont le nom commun contient le mot "xxx".
		// System.out.println("===================== findByCommonNameLike
		// =====================");
		// System.out.println(speciesRepository.findByCommonNameLike("Chien"));
		// System.out.println("================================================================");

		// // Avec la méthode findByAgeBetween, retournez toutes les personnes dont
		// l'âge
		// // est entre xx et xx ans.
		// System.out.println("===================== findByAgeBetween
		// =====================");
		// System.out.println(personRepository.findByAgeBetween(18, 30));
		// System.out.println("============================================================");

		// // Avec la méthode findByAnimal, retournez toutes les personnes qui possèdent
		// un
		// // animal donné
		// System.out.println("===================== findByAnimal
		// =====================");
		// System.out.println(personRepository.findByAnimal(animalRepository.findById(1).orElseThrow()));
		// System.out.println("========================================================");

		// // Avec la méthode countBySex, retournez le nombre d'animaux du sexe donné
		// System.out.println("===================== countBySex =====================");
		// System.out.println(animalRepository.countBySex(Sex.M));
		// System.out.println(animalRepository.countBySex(Sex.F));
		// System.out.println("======================================================");

		// // Avec la méthode hasOwner, retournez true si l'animal donné a un
		// propriétaire
		// System.out.println("===================== hasOwner =====================");
		// System.out.println("ID : 1 => " +
		// animalRepository.hasOwner(animalRepository.findById(1).orElseThrow()));
		// System.out.println("ID : 2 => " +
		// animalRepository.hasOwner(animalRepository.findById(2).orElseThrow()));
		// System.out.println("ID : 3 => " +
		// animalRepository.hasOwner(animalRepository.findById(3).orElseThrow()));
		// System.out.println("ID : 4 => " +
		// animalRepository.hasOwner(animalRepository.findById(4).orElseThrow()));
		// System.out.println("ID : 5 => " +
		// animalRepository.hasOwner(animalRepository.findById(5).orElseThrow()));
		// System.out.println("ID : 6 => " +
		// animalRepository.hasOwner(animalRepository.findById(6).orElseThrow()));
		// System.out.println("ID : 7 => " +
		// animalRepository.hasOwner(animalRepository.findById(7).orElseThrow()));
		// System.out.println("ID : 8 => " +
		// animalRepository.hasOwner(animalRepository.findById(8).orElseThrow()));
		// System.out.println("ID : 9 => " +
		// animalRepository.hasOwner(animalRepository.findById(9).orElseThrow()));
		// System.out.println("====================================================");

	}

}
