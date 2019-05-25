package Modelo;

import java.util.LinkedList;
import java.util.Queue;

public class CirujanoActivo extends Medico{
	private LinkedList <Intervencion> intervenciones;
	
	public CirujanoActivo(String idPersona, String nombre, String direccion, String telefono,
			Especialidades especialidad) {
		super(idPersona, nombre, direccion, telefono, especialidad);
		intervenciones=new LinkedList<Intervencion>();
	}

	public Queue <Intervencion> getIntervenciones() {
		return intervenciones;
	}

	public boolean addIntervencion(Intervencion intervencion) {
		return intervenciones.add(intervencion);
	}
}
