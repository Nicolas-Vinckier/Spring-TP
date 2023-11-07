package fr.diginamic.Spring_Data_JPA.repository;

import org.springframework.data.repository.CrudRepository;

import fr.diginamic.Spring_Data_JPA.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
