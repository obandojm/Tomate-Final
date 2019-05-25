package Modelo;

import java.util.Date;

public class Cita {
	private String idCita;
	private Paciente paciente;
	private Date fechaCita;
	private boolean confirmacionDeAsistencia;
	private String observaciones;
	
	public Cita(String idCita, Paciente paciente, boolean confirmacionAsistencia, Date fechaCita) {
		super();
		this.idCita=idCita;
		this.setPaciente(paciente);
		confirmacionAsistencia=true;
		this.fechaCita=fechaCita;
	}

	public String getIdCita() {
		return idCita;
	}

	public Date getFechaCita() {
		return fechaCita;
	}

	public boolean isConfirmacionDeAsistencia() {
		return confirmacionDeAsistencia;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
