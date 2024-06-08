package br.com.etec.projetoquickstartguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoquickstartguideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoquickstartguideApplication.class, args);
	}	

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value="nome", defaultValue = "World") String nome){
		return "Hello " + nome + "!";
	}

}
