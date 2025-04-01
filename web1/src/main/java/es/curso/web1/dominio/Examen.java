package es.curso.web1.dominio;

public class Examen {

	private int id;
	private String asignatura;
	// es una relacion del modelo de dominio
	private Persona persona;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Examen(int id, String asignatura) {
		super();
		this.id = id;
		this.asignatura = asignatura;
	}
	
	
}
