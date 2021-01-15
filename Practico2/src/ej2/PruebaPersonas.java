package ej2;

public class PruebaPersonas {
	public static void main(String[] args) {
		ColeccionPersonas personas = new ColeccionPersonas();
		try {
			Persona persona1 = new Persona(46269062, "Javier");
			Persona persona2 = new Persona(48061513, "Jordana");
			Persona persona3 = new Persona(15865941, "Yoly");
			Persona persona4 = new Persona(14067343, "Jorge");
			Persona persona5 = new Persona(11234567, "Loquito");

			personas.agregarPersona(persona1);
			personas.agregarPersona(persona2);
			personas.agregarPersona(persona3);
			personas.agregarPersona(persona4);
			personas.agregarPersona(persona5);

			System.out.println(personas.buscarPersona(11234567));
		} catch (PersonaNoEncontradaException e) {
			System.out.println(e.getMensaje());

		}
	}
}
