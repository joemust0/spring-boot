package br.com.etec.projetoquickstartguide.RestControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacoesRestController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value="nome", defaultValue = "World") String nome){
		return "Hello " + nome + "!";
	}

}

