package Modelo;

public enum Medicamentos {
	paracetamol('1'), ibuprofeno('2'), dalsy('3'), apiretal('4'), trankimazin('5'), amoxicilina('6'), bilaxten('7');
	private char id;
	
	Medicamentos(char id) {
		this.id=id;
	}

	public char getId() {
		return id;
	}

}
