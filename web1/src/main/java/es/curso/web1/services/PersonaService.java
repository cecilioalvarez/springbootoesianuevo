package es.curso.web1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.web1.dominio.Examen;
import es.curso.web1.dominio.Persona;
import es.curso.web1.repositories.ExamenRepository;
import es.curso.web1.repositories.PersonaRepository;
@Service
public class PersonaService {

	// de inyeccion de dependencias 
	// e inyectamos interfaces el tiene que decidir que
	//implementacion 
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Autowired
	private ExamenRepository examenRepository;

	public List<Persona> buscarTodosPersona() {
		return personaRepository.buscarTodos();
	}

	public void insertarPersona(Persona persona) {
		personaRepository.insertar(persona);
	}

	public void borrarPersona(Persona persona) {
		personaRepository.borrar(persona);
	}

	public List<Examen> buscarTodosExamenes(Persona persona) {
		return examenRepository.buscarTodosExamenes(persona);
	}
	
	
}
