package colecciones;

import java.util.Hashtable;
import java.util.Iterator;

public class HashPersonas {
	private Hashtable<Integer, Persona> personas;

	public HashPersonas() {
		personas = new Hashtable<Integer, Persona>();
	}

	public void insertar(Persona p) {
		personas.put(p.getCedula(), p);
	}

	public Iterator listar() {
		return personas.values().iterator();
	}

	public void mostrar() {
		Iterator it = listar();
		while (it.hasNext()) {
			Persona p = (Persona) it.next();
			System.out.println(p.getNombre());
		}
	}

	public boolean existe(int cedula) {
		boolean resu = false;
		if (personas.containsKey(cedula))
			resu = true;
		return resu;
	}

	public void remover(int cedula) {
		personas.remove(cedula);
	}
}
