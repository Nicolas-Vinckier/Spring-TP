package fr.diginamic.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.diginamic.Spring_Data_JPA.model.Species;

@Repository
public interface SpeciesRepository extends CrudRepository<Species, Integer> {

    Species findFirstByCommonName(String commonName);

    List<Species> findBylatinNameContainsIgnoreCase(String latinName);

    @Query("SELECT s FROM Species s ORDER BY s.commonName ASC")
    List<Species> findAllByOrderByCommonNameAsc();

    @Query("SELECT s FROM Species s WHERE s.commonName LIKE %:commonName%")
    List<Species> findByCommonNameLike(@Param("commonName") String commonName);
}
