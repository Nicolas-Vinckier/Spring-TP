package fr.diginamic.tp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.tp.service.*;

@SpringBootApplication
@RestController
public class TpApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpApplication.class, args);
	}

	@GetMapping("hello")
	public String hello() {
		return "Hello World !";
	}

	@Autowired
	public void setBavardService(BavardService bavardService) {
		bavardService.parler();
	}

}
