package practico14;

public class ColeccionPersonas {
	private Persona[] arreglo;
	private int tope;

	public ColeccionPersonas(int tamanio) {
		arreglo = new Persona[tamanio];
		tope = 0;
	}

	public boolean estaLlena() {
		return !(tope < arreglo.length);
	}

	public boolean existePersona(String nombre, String apellido) {
		boolean existe = false;
		for (int i = 0; i < tope; i++) {
			if (arreglo[i].getNombre().equals(nombre) && arreglo[i].getApellido().equals(apellido)) {
				existe = true;
			}
		}
		return existe;
	}

	public void insertarPersona(Persona per) {
		if (this.estaLlena() == false) {
			this.arreglo[this.tope] = per;
			this.tope++;
		}
	}

	public Persona obtenerMasJoven() {
		int menorEdad = 999;
		Persona masJoven = null;
		for (int i = 0; i < tope; i++) {
			if (arreglo[i].getEdad() < menorEdad) {
				menorEdad = arreglo[i].getEdad();
				masJoven = arreglo[i];
			}
		}
		return masJoven;
	}

	public String listarDatosPersonas() {
		String lista = "";
		for (int i = 0; i < tope; i++) {
			lista = lista + arreglo[i].toString() + "\n";
		}
		return lista;
	}

}
