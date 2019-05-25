package Modelo;

public abstract class Persona {
	private String IdPersona;
	private String nombre;
	private String direccion;
	private String telefono;
	
	
	
	public Persona(String idPersona, String nombre, String direccion, String telefono) {
		super();
		IdPersona = idPersona;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getIdPersona() {
		return IdPersona;
	}
	
	public void setIdPersona(String idPersona) {
		IdPersona = idPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
}
