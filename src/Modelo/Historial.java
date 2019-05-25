package Modelo;

import java.util.LinkedList;

public class Historial {
	private String idPaciente;
	private LinkedList <Cita> historialCitas;
	private LinkedList <Intervencion> historialIntervenciones;
	private LinkedList <Tratamiento> historialTratamientos;
	
	public Historial(String idPaciente) {
		super();
		this.idPaciente=idPaciente;
		historialCitas=new LinkedList<Cita>();
		historialIntervenciones=new LinkedList<Intervencion>();
		historialTratamientos=new LinkedList<Tratamiento>();
	}
	
	public String getIdPaciente() {
		return idPaciente;
	}

	public LinkedList<Cita> getHistorialCitas() {
		return historialCitas;
	}

	public LinkedList<Intervencion> getHistorialIntervenciones() {
		return historialIntervenciones;
	}

	public LinkedList<Tratamiento> getHistorialTratamientos() {
		return historialTratamientos;
	}
	
	public boolean addCitaHistorial(Cita cita) {
		return historialCitas.add(cita);
	}
	
	public boolean addIntervencionHistorial(Intervencion intervencion) {
		return historialIntervenciones.add(intervencion);
	}
	
	public boolean addTratamientoHistorial(Tratamiento tratamiento) {
		return historialTratamientos.add(tratamiento);
	}
	
}
