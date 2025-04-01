package es.curso.web1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.web1.dominio.Examen;
import es.curso.web1.dominio.Persona;
import es.curso.web1.repositories.PersonaRepository;
import es.curso.web1.services.PersonaService;

//cuando vayamos a la url /personas accedemos a esta clase

@Controller
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	
	@GetMapping("/hola")
	public String holaPersona(Model modelo) {
		
		Persona p= new Persona ("pepe","perez",20);
		
		modelo.addAttribute("persona",p);
		return "persona";
	}

	@GetMapping("/lista")
	public String listaPersonas(Model modelo) {
		
		modelo.addAttribute("listapersonas",personaService.buscarTodosPersona());
		return "listapersonas";
	}

	
	@GetMapping("/formularionuevo")
	public String formularioNuevo() {
	
		return "formularionuevo";
	}

	
	@PostMapping("/insertar")
	public String insertar(Persona persona) {
		
		personaService.insertarPersona(persona);
		
		return "redirect:/personas/lista";
	}
	
	@GetMapping("/borrar")  
	public String borrar(@RequestParam String nombre) {
		
		personaService.borrarPersona(new Persona(nombre));
		
		return "redirect:/personas/lista";
	}
	
	@GetMapping("/listaexamenes")  
	public String listaExamenes(Model modelo,@RequestParam String nombre) {
		
		List<Examen> listaExamenes=personaService.buscarTodosExamenes(new Persona(nombre));
		modelo.addAttribute("listaexamenes",listaExamenes);
		
		return "listaexamenespersona";
	}

}
