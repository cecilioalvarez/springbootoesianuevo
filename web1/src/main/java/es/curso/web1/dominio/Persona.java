package es.curso.web1.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	List<Examen> examenes= new ArrayList<Examen>();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}


	public Persona() {
		super();
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public List<Examen> getExamenes() {
		return examenes;
	}
	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}
	public void addExamen (Examen examen) {
		this.examenes.add(examen);
	}
	public void removeExamen (Examen examen) {
		this.examenes.remove(examen);
	}
	
}
