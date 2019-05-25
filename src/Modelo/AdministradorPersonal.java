package Modelo;

import java.util.ArrayList;


public class AdministradorPersonal {
	private ArrayList <MedicoActivo> medicosAtencionPrimaria;
	private ArrayList<MedicoActivo>  medicosEspecialistas;
	private ArrayList<CirujanoActivo> cirujanos;
	private ArrayList<MedicoNoActivo> medicosInactivos;
	
	public AdministradorPersonal() {
		medicosAtencionPrimaria=new ArrayList<MedicoActivo>();
		medicosEspecialistas=new ArrayList<MedicoActivo>();
		cirujanos=new ArrayList<CirujanoActivo>();
		medicosInactivos=new ArrayList<MedicoNoActivo>();
	}
	
	public ArrayList<MedicoActivo> getMedicosAtencionPrimaria() {
		return medicosAtencionPrimaria;
	}

	public ArrayList<MedicoActivo> getMedicosEspecialistas() {
		return medicosEspecialistas;
	}

	public ArrayList<CirujanoActivo> getCirujanos() {
		return cirujanos;
	}

	public ArrayList<MedicoNoActivo> getMedicosInactivos() {
		return medicosInactivos;
	}

	public boolean darDeAltaMedico(MedicoActivo medico) {
		boolean insertado;
		
		if(medico.getEspecialidad()!=Especialidades.AtencionPrimaria){
			insertado=medicosEspecialistas.add(medico);
		}else {
			insertado=medicosAtencionPrimaria.add(medico);
		}
		return insertado;
	}
	
	public boolean darDeAltaCirujano(CirujanoActivo cirujano) {
		return cirujanos.add(cirujano);
	}
	
	//Si no hay ningun medico con el nombre introducido retornara null
	public MedicoActivo getMedicoActivoPorNombre(String nombre) {
		MedicoActivo medico=null;
		
		for (MedicoActivo medicoAtencionPrimaria : medicosAtencionPrimaria) {
			if(medicoAtencionPrimaria.getNombre()==nombre) {
				medico=medicoAtencionPrimaria;
			}
		}
		
		for (MedicoActivo medicoEspecialista : medicosEspecialistas) {
			if(medicoEspecialista.getNombre()==nombre) {
				medico=medicoEspecialista;
			}
		}
		return medico;
	}
	//idem getMedicoPorNombre solo que por id
	public MedicoActivo getMedicoActivoPorId(String idMedico) {
		MedicoActivo medico=null;
				
		for (MedicoActivo medicoAtencionPrimaria : medicosAtencionPrimaria) {
			if(medicoAtencionPrimaria.getIdPersona()==idMedico) {
				medico=medicoAtencionPrimaria;
			}
		}
				
		for (MedicoActivo medicoEspecialista : medicosEspecialistas) {
			if(medicoEspecialista.getIdPersona()==idMedico) {
				medico=medicoEspecialista;
			}
		}
		return medico;
	}
	
	public CirujanoActivo getCirujanoActivoPorNombre(String nombre) {
		CirujanoActivo cirujano=null;
		
		for (CirujanoActivo cirujanoActivo : cirujanos) {
			if(cirujanoActivo.getNombre()==nombre) {
				cirujano=cirujanoActivo;
			}
		}
		return cirujano;
	}
	
	public CirujanoActivo getCirujanoActivoPorId(String idCirujano) {
		CirujanoActivo cirujano=null;
		
		for (CirujanoActivo cirujanoActivo : cirujanos) {
			if(cirujanoActivo.getIdPersona()==idCirujano) {
				cirujano=cirujanoActivo;
			}
		}
		return cirujano;
	}
	
	public boolean darDeBajaMedicoActivo(MedicoActivo medico) {
		int posicion;
		boolean eliminado=false;
		MedicoNoActivo medicoDadoDeBaja;
		
		if(medicosAtencionPrimaria.contains(medico)){
			posicion=medicosAtencionPrimaria.indexOf(medico);
			medicosAtencionPrimaria.remove(posicion);
			medicoDadoDeBaja=new MedicoNoActivo(medico.getIdPersona(), medico.getNombre(), medico.getDireccion(), medico.getTelefono(), medico.getEspecialidad());
			eliminado=medicosInactivos.add(medicoDadoDeBaja);
		}else {
			posicion=medicosEspecialistas.indexOf(medico);
			medicosEspecialistas.remove(posicion);
			medicoDadoDeBaja=new MedicoNoActivo(medico.getIdPersona(), medico.getNombre(), medico.getDireccion(), medico.getTelefono(), medico.getEspecialidad());
			eliminado=medicosInactivos.add(medicoDadoDeBaja);
		}
		
		return eliminado;
	}
	
	public boolean darDeBajaCirujanoActivo(CirujanoActivo cirujano) {
		int posicion;
		boolean eliminado=false;
		MedicoNoActivo cirujanoDadoDeBaja;
		
		posicion=cirujanos.indexOf(cirujano);
		cirujanos.remove(posicion);
		cirujanoDadoDeBaja=new MedicoNoActivo(cirujano.getIdPersona(), cirujano.getNombre(), cirujano.getDireccion(), cirujano.getTelefono(), cirujano.getEspecialidad());
		eliminado=medicosInactivos.add(cirujanoDadoDeBaja);
		
		return eliminado;
	}
}
