package es.curso.web1.repositories.memoria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.curso.web1.modelo.Persona;
import es.curso.web1.repositories.PersonaRepository;
@Component
public class PersonaRepositoryMemoria implements PersonaRepository {

	List<Persona> lista= new ArrayList<Persona>();
	
	public PersonaRepositoryMemoria() {
		super();
		
		lista.add(new Persona("juan","gomez",40));
		lista.add(new Persona("ana","perez",50));
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		
	}

}
