package test;

import domain.Persona;

public class TestFinal {
	public static void main(String[] args) {
		
		final int miVariable = 10;
		System.out.println("mi constante: " + miVariable);
		
		//miVariable=11;
		
		
		
		// se puede modificar los atributos de persona 1 aunque sea Final
		final Persona persona1 = new Persona();
		
		persona1.setNombre("Javier");
		System.out.println(persona1.getNombre());
		
		
		
		
	}

}
  