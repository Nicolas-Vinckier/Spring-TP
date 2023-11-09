package fr.diginamic.Spring_Data_JPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.diginamic.Spring_Data_JPA.model.Species;

import fr.diginamic.Spring_Data_JPA.repository.SpeciesRepository;

@Controller
@RequestMapping("/species")
public class SpeciesController {

    @Autowired
    private SpeciesRepository speciesRepository;

    @GetMapping("/")
    public String listSpecies(Model model) {
        List<Species> species = speciesRepository.findAll();
        model.addAttribute("speciesList", species);

        return "list_species";
    }

    @GetMapping("/{id}")
    public String initUpdate(@PathVariable("id") Integer id, Model model) {
        Optional<Species> species = speciesRepository.findById(id);
        if (species.isPresent()) {
            model.addAttribute(species.get());
            return "update_species";
        }
        return "error";
    }

    @GetMapping("/create")
    public String initCreate(Model model) {
        model.addAttribute(new Species());
        return "create_species";
    }

    // @PostMapping("/species")
    // public String createOrUpdate(Species speciesItem) {
    // this.speciesRepository.save(speciesItem);
    // return "redirect:/species";
    // }
    @PostMapping("/")
    public String createOrUpdate(@RequestBody Species speciesItem) {
        this.speciesRepository.save(speciesItem);
        return "redirect:/species";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer speciesId) {
        Optional<Species> speciesToDelete = this.speciesRepository.findById(speciesId);
        speciesToDelete.ifPresent(species -> this.speciesRepository.delete(species));
        return "redirect:/species";
    }
}
