package test;

import dominio.Persona;

public class PersonaPrueba {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Javier", "Cordobes", 32, false);
		persona1.imprimirDatos();
		System.out.println(persona1.toString());
	}
}
