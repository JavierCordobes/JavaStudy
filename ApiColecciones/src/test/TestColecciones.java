package test;

import java.util.*;

public class TestColecciones {
	public static void main(String[] args) {
		List miLista = new ArrayList();
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Sabado");
		miLista.add("Domingo");
		//imprimir(miLista);

		Set miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		miSet.add("Sabado");
		miSet.add("Domingo");
		imprimir(miSet);
		
		Map miMapa = new HashMap();
		miMapa.put("valor1", "Javier");
		miMapa.put("valor2", "Jordi");
		miMapa.put("valor3", "Jorge");
		miMapa.put("valor4", "Yoly");
		
		String elemento = (String) miMapa.get("valor1");
		System.out.println(elemento);
		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
		
	}
	
	
	
	
	

	public static void imprimir(Collection coleccion) {
		for (Object o : coleccion) {
			System.out.println(o);
		}
	}

}