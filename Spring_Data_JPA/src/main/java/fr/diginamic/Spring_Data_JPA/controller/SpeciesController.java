package fr.diginamic.Spring_Data_JPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.diginamic.Spring_Data_JPA.model.Species;

import fr.diginamic.Spring_Data_JPA.repository.SpeciesRepository;

@Controller
public class SpeciesController {

    @Autowired
    private SpeciesRepository speciesRepository;

    @GetMapping("/species")
    public String listSpecies(Model model) {
        List<Species> species = (List<Species>) speciesRepository.findAll();
        model.addAttribute("species", species);
        return "list_species";
    }

    @GetMapping("/species/{id}")
    public String initUpdate(@PathVariable("id") Integer id, Model model) {
        Optional<Species> species = speciesRepository.findById(id);
        if (species.isPresent()) {
            model.addAttribute(species.get());
            return "update_species";
        }
        return "error";
    }

    @GetMapping("/species/create")
    public String initCreate(Model model) {
        model.addAttribute(new Species());
        return "create_species";
    }

}
