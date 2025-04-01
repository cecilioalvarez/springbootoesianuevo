package es.curso.web1.repositories.memoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.curso.web1.dominio.Examen;
import es.curso.web1.dominio.Persona;
import es.curso.web1.infraestructura.GestorAlmacen;
import es.curso.web1.repositories.ExamenRepository;

@Component
public class ExamenRepositoryMemoria implements ExamenRepository {

	@Autowired
	GestorAlmacen gestorAlmacen;

	@Override
	public List<Examen> buscarTodosExamenes(Persona persona) {
		// TODO Auto-generated method stub
		Optional<Persona> oPersona = gestorAlmacen.getLista().stream()
				.filter((p) -> p.getNombre().equals(persona.getNombre())).findFirst();

		if (oPersona.isPresent()) {

			return oPersona.get().getExamenes();
		} else {

			return new ArrayList<Examen>();
		}
	}

}
