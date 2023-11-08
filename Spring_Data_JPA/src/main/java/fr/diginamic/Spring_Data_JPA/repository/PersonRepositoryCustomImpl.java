package fr.diginamic.Spring_Data_JPA.repository;

import java.util.Locale;

import com.github.javafaker.Faker;

import fr.diginamic.Spring_Data_JPA.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class PersonRepositoryCustomImpl implements PersonRepositoryCustom {
    // Permet d'injecter l'entity manager pour pouvoir faire des requêtes SQL
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void deleteAllByAnimalsEmpty() {
        entityManager.createQuery("delete from Person p where p.animals is empty").executeUpdate();
    }

    @Override
    public void createXPerson(Integer x) {
        Faker faker = new Faker(new Locale("fr"));
        for (int i = 0; i < x; i++) {
            Person person = new Person();
            person.setFirstName(faker.name().firstName());
            person.setLastName(faker.name().lastName());
            person.setAge(faker.number().numberBetween(18, 80));

            entityManager.persist(person);
        }
    }
}
