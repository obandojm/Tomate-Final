package Modelo;

public abstract class Medico extends Persona {
	private Especialidades especialidad;

	public Medico(String idPersona, String nombre, String direccion, String telefono, Especialidades especialidad) {
		super(idPersona, nombre, direccion, telefono);
		this.setEspecialidad(especialidad);
	}

	public Especialidades getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidades especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
