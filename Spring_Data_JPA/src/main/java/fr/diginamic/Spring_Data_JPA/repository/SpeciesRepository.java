package fr.diginamic.Spring_Data_JPA.repository;

// import java.util.List;
import org.springframework.data.repository.CrudRepository;

import fr.diginamic.Spring_Data_JPA.model.Species;

public interface SpeciesRepository extends CrudRepository<Species, Integer> {

    Species findFirstByCommonName(String commonName);
}
