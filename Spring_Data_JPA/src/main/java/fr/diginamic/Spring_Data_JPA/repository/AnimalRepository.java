package fr.diginamic.Spring_Data_JPA.repository;

import org.springframework.data.repository.CrudRepository;

import fr.diginamic.Spring_Data_JPA.model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {

}
