package test;

import dominio.Persona;

public class PersonaPrueba {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Javier");
		Persona persona2 = new Persona("Jordana");
		Persona persona3 = new Persona("Jorge");
		Persona persona4 = new Persona("Yoly");

		imprimir(persona1);
		imprimir(persona2);
		imprimir(persona3);
		imprimir(persona4);

	}

	public static void imprimir(Persona persona) {
		System.out.println(persona);
	}

}
