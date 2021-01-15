package ej2;

public class ColeccionPersonas {
	static final int MAX = 100;
	private Persona[] personas;
	private int tope;

	public ColeccionPersonas() {
		personas = new Persona[MAX];
		tope = 0;
	}

	public void agregarPersona(Persona p) {
		if (tope < MAX) {
			personas[tope++] = p;
		}
	}

	public Persona buscarPersona(long cedula) throws PersonaNoEncontradaException {
		Persona personaBuscada = null;
		for (int i = 0; i < tope; i++) {
			if (this.personas[i].getCedula() == cedula) {
				personaBuscada = personas[i];
				break;
			}
		}
		if (personaBuscada == null) {
			String msj = "No se encuentra la persona con Cedula: " + cedula;
			throw new PersonaNoEncontradaException(msj);

		}
		return personaBuscada;
	}
}
