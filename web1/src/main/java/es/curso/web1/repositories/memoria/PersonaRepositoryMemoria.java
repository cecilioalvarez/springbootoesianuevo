package es.curso.web1.repositories.memoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.curso.web1.dominio.Persona;
import es.curso.web1.infraestructura.GestorAlmacen;
import es.curso.web1.repositories.PersonaRepository;
@Component
public class PersonaRepositoryMemoria implements PersonaRepository {

	@Autowired
	GestorAlmacen gestorAlmacen;
	
	public PersonaRepositoryMemoria() {
		super();
		
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return gestorAlmacen.getLista();
	}

	@Override
	public void insertar(Persona persona) {
		gestorAlmacen.addPersona(persona);
		
	}

	@Override
	public void borrar(Persona persona) {
		gestorAlmacen.removePersona(persona);
		
	}

}
