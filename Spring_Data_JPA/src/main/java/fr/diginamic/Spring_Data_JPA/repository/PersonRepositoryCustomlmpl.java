package fr.diginamic.Spring_Data_JPA.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class PersonRepositoryCustomlmpl implements PersonRepositoryCustom {
    // Permet d'injecter l'entity manager pour pouvoir faire des requêtes SQL
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void deleteAllByAnimalsEmpty() {
        entityManager.createQuery("delete from Person p where p.animals is empty").executeUpdate();
    }

}
