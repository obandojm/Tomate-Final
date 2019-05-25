package Modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class AdministradorPersonalTest {

	
	@Test
	void testDarDeBajaMedicoActivo() {
		AdministradorPersonal personal=new AdministradorPersonal();
		MedicoActivo medicoUno=new MedicoActivo("1", "Pepe Laja", "N/A","N/A" , Especialidades.AtencionPrimaria, null, null);
		MedicoActivo medicoDos=new MedicoActivo("2", "Manuel Moajama", "N/A","N/A" , Especialidades.Traumatologia, null, null);
		CirujanoActivo cirujano=new CirujanoActivo("3", "Felipe Lopez", "N/A","N/A" , Especialidades.Cirujia);
		
		personal.darDeAltaMedico(medicoUno);
		personal.darDeAltaMedico(medicoDos);
		personal.darDeAltaCirujano(cirujano);
		
		assertTrue(personal.darDeBajaMedicoActivo(medicoUno));
		assertTrue(personal.darDeBajaMedicoActivo(medicoDos));
		assertTrue(personal.darDeBajaCirujanoActivo(cirujano));
		
		assertFalse(personal.getMedicosAtencionPrimaria().contains(medicoUno));
		assertFalse(personal.getMedicosEspecialistas().contains(medicoDos));
		assertFalse(personal.getCirujanos().contains(cirujano));
		
		assertFalse(personal.getMedicosInactivos().isEmpty());
	}
	
	@Ignore
	void testGetMedicoActivoPorNombre() {
		AdministradorPersonal personal=new AdministradorPersonal();
		MedicoActivo medicoUno=new MedicoActivo("1", "Pepe Laja", "N/A","N/A" , Especialidades.AtencionPrimaria, null, null);
		MedicoActivo medicoDos=new MedicoActivo("2", "Manuel Moajama", "N/A","N/A" , Especialidades.Traumatologia, null, null);
		
		personal.darDeAltaMedico(medicoUno);
		personal.darDeAltaMedico(medicoDos);
		
		assertEquals(medicoUno, personal.getMedicoActivoPorNombre("Pepe Laja"));
		assertEquals(medicoDos, personal.getMedicoActivoPorNombre("Manuel Moajama"));
	}

}
