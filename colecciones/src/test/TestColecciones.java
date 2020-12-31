package test;

import colecciones.ListaPersonas;
import colecciones.Persona;

public class TestColecciones {
	public static void main(String[] args) {
		Persona persona1 = new Persona(46269062, "Javier");
		Persona persona2 = new Persona(48061513, "Jordana");
		
		ListaPersonas lista1 = new ListaPersonas();

		
			lista1.agregar(persona1);
			lista1.agregar(persona2);
		

		lista1.listar();
		lista1.remover(persona1);
		lista1.listar();
	}

}
