package fr.diginamic.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.diginamic.Spring_Data_JPA.model.*;

public interface PersonRepository extends CrudRepository<Person, Integer>, PersonRepositoryCustom {

    List<Person> findFirstByLastnameOrFirstname(String lastname, String firstname);

    List<Person> findByAgeGreaterThanEqual(int age);

    @Query("SELECT p FROM Person p WHERE p.age BETWEEN :minAge AND :maxAge")
    List<Person> findByAgeBetween(@Param("minAge") int minAge, @Param("maxAge") int maxAge);

    @Query("SELECT p FROM Person p INNER JOIN p.animals a ON a = :animal")
    List<Person> findByAnimal(@Param("animal") Animal animal);

}
