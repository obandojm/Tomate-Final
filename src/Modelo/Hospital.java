package Modelo;

import java.util.LinkedList;

public class Hospital {
	AdministradorPersonal personal;
	AdministradorDePacientes pacientes;
	LinkedList<Historial> historicos;
	LinkedList<Consulta> consultas;
	
	public Hospital() {
		super();
		personal=new AdministradorPersonal();
		pacientes=new AdministradorDePacientes();
		historicos=new LinkedList<Historial>();
		consultas=new LinkedList<Consulta>();
	}
}
