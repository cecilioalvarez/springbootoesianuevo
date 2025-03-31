package es.curso.web1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.curso.web1.modelo.Persona;
import es.curso.web1.repositories.PersonaRepository;

//cuando vayamos a la url /personas accedemos a esta clase

@Controller
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private PersonaRepository personaRepository;
	
	
	@GetMapping("/hola")
	public String holaPersona(Model modelo) {
		
		Persona p= new Persona ("pepe","perez",20);
		
		modelo.addAttribute("persona",p);
		return "persona";
	}

	@GetMapping("/lista")
	public String listaPersonas(Model modelo) {
		
		modelo.addAttribute("listapersonas",personaRepository.buscarTodos());
		return "listapersonas";
	}

}
