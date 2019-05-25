package Modelo;

import java.util.Date;

public class Tratamiento {
	private String idPaciente;
	private Medicamentos medicacion;
	private String dosis;
	private Date fechaInicio;
	private Date fechaFin;
	
	public Tratamiento(String idPaciente, Medicamentos medicacion, String dosis, Date fechaInicio, Date fechaFin) {
		super();
		this.idPaciente=idPaciente;
		this.medicacion=medicacion;
		this.dosis=dosis;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public Medicamentos getMedicacion() {
		return medicacion;
	}

	public String getDosis() {
		return dosis;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}
	
	
}
