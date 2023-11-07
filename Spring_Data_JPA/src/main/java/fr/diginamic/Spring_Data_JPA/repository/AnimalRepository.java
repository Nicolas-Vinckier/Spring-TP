package fr.diginamic.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.diginamic.Spring_Data_JPA.model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {

    List<Animal> findBySpeciesId(Integer id);

    List<Animal> findByColor(String color);
}
