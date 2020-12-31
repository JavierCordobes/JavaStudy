package colecciones;

import java.util.ArrayList;

public class ListaPersonas {
	private ArrayList<Persona> personas;

	public ListaPersonas() {
		personas = new ArrayList<Persona>();
	}

	public void listar() {
		for (Persona p : personas) {
			System.out.println(p.getNombre());
		}
	}
	
	

	public void agregar(Persona p) {
		personas.add(p);
	}
	


	public int cuantasHay() {
		return personas.size();
	}

	public Persona obtener(int posicion) {
		return personas.get(posicion);
	}
	
	public void remover(int cedula) {
		personas.remove(cedula);
	}
	
	public void remover(Persona persona) {
		personas.remove(persona);
	}
	
	
}

