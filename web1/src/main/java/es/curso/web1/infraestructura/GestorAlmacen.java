package es.curso.web1.infraestructura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.curso.web1.dominio.Examen;
import es.curso.web1.dominio.Persona;

@Component
public class GestorAlmacen {

	private List<Persona> lista = new ArrayList<Persona>();

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	public GestorAlmacen() {

		lista.add(new Persona("juan", "gomez", 40));
		lista.add(new Persona("ana", "perez", 50));

		Persona p = new Persona("gema", "blanco", 30);
		p.addExamen(new Examen(1, "matematicas"));
		lista.add(p);
	}

	public void addPersona(Persona persona) {

		lista.add(persona);
	}

	public void removePersona(Persona persona) {

		lista.remove(persona);
	}

}
