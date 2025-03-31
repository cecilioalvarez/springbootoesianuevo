package es.curso.web1.repositories;

import java.util.List;

import es.curso.web1.modelo.Persona;

public interface PersonaRepository {

	List<Persona> buscarTodos();
	void insertar(Persona persona);
	
}
