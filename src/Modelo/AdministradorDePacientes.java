package Modelo;

import java.util.LinkedList;

public class AdministradorDePacientes {
	private LinkedList<Paciente> pacientes; 

	public AdministradorDePacientes() {
		super();
		pacientes=new LinkedList<Paciente>();
	}
	
	public boolean darDeAltaPaciente(Paciente paciente) {
		return pacientes.add(paciente);
	}
	
	public Paciente buscarPacientePorNombre(String nombre) {
		Paciente pacienteABuscar=null;
		
		for (Paciente paciente : pacientes) {
			if(paciente.getNombre()==nombre) {
				pacienteABuscar=paciente;
			}
		}
		return pacienteABuscar;
	}
	
	public Paciente buscarPacientePorId(String idPaciente) {
		Paciente pacienteABuscar=null;
		
		for (Paciente paciente : pacientes) {
			if(paciente.getIdPersona()==idPaciente) {
				pacienteABuscar=paciente;
			}
		}
		return pacienteABuscar;
	}
	
	public boolean darDeBajaPaciente(Paciente paciente) {
		
		return pacientes.remove(paciente);
	}
}
