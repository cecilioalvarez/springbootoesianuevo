package es.curso.web1.repositories;

import java.util.List;

import es.curso.web1.dominio.Examen;
import es.curso.web1.dominio.Persona;

public interface ExamenRepository {
	
	List<Examen> buscarTodosExamenes(Persona persona);

}
