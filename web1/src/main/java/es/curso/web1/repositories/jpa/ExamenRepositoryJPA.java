package es.curso.web1.repositories.jpa;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import es.curso.web1.dominio.Examen;
import es.curso.web1.dominio.Persona;
import es.curso.web1.repositories.ExamenRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
@Primary
@Repository
public class ExamenRepositoryJPA implements ExamenRepository {

	@PersistenceContext
	EntityManager em;
	@Override
	public List<Examen> buscarTodosExamenes(Persona persona) {
		
		TypedQuery<Examen> consulta=em.createQuery("select e from Examen e where e.persona.nombre=:nombre",Examen.class);
		consulta.setParameter("nombre", persona.getNombre());
		return consulta.getResultList();
	}

}
