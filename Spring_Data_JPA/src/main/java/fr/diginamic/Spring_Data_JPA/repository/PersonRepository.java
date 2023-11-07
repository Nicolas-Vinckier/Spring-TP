package fr.diginamic.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.diginamic.Spring_Data_JPA.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    List<Person> findFirstByLastnameOrFirstname(String lastname, String firstname);
}
