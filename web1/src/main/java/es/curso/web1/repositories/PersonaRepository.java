package es.curso.web1.repositories;

import java.util.List;

import es.curso.web1.dominio.Persona;

public interface PersonaRepository {

	List<Persona> buscarTodos();
	void insertar(Persona persona);
	void borrar(Persona persona);
	
}
