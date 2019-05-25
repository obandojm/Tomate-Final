package Modelo;

import java.util.Date;
import java.util.Stack;

public class Paciente extends Persona {
	private Date fechaNacimiento; //hay que cambiar el tipo de dato
	private Stack<Cita> citas;
	
	public Paciente(String idPersona, String nombre, String direccion, String telefono, Date fechaNacimiento) {
		super(idPersona, nombre, direccion, telefono);
		this.setFechaNacimiento(fechaNacimiento);
		citas=new Stack<Cita>();
	}

	public Stack<Cita> getCitas() {
		return citas;
	}

	public void setCitas(Stack<Cita> citas) {
		this.citas = citas;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
