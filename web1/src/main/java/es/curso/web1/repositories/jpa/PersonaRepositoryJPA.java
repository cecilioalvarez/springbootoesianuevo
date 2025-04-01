package es.curso.web1.repositories.jpa;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.curso.web1.dominio.Persona;
import es.curso.web1.repositories.PersonaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Primary
@Repository
public class PersonaRepositoryJPA  implements PersonaRepository{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Persona> buscarTodos() {
		
		// esto es una consulta orientada a objeto
		// jpa query language 
		return em.createQuery("select p from Persona p",Persona.class).getResultList();
	}

	@Transactional
	public void insertar(Persona persona) {
		em.persist(persona);
		
	}

	@Transactional
	public void borrar(Persona persona) {
		
		em.remove(em.merge(persona));
		
	}

	

}
