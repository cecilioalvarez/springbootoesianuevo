package es.curso.web1.modelo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//cuando vayamos a la url /personas accedemos a esta clase

@Controller
@RequestMapping("/personas")
public class PersonaController {

	
	@GetMapping("/hola")
	public String holaPersona() {
		
		return "persona";
	}
	
}
