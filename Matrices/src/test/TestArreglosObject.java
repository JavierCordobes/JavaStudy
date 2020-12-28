package test;

import domain.Persona;

public class TestArreglosObject {
	public static void main(String[] args) {
		
		Persona personas[]=new Persona[5];
		

		personas[0] = new Persona("Javier");
		personas[1] = new Persona("Jordi");
		personas[2]= new Persona("Jorge");
		personas[3]= new Persona("Yoly");
		personas[4]= new Persona("Tali");
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("indice "+ i + " " + personas[i]);
		}
		
		String frutas[] = {"Naranja","Banana","Kiwi","Melon","Alfajor de Pollo"} ;		
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		
		
	}
}
