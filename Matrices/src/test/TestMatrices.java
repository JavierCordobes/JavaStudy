package test;

import domain.Persona;

public class TestMatrices {

	public static void main(String[] args) {
		int edades[][] = new int[3][2];

		edades[0][0] = 1;
		edades[0][1] = 2;
		edades[1][0] = 3;
		edades[1][1] = 4;
		edades[2][0] = 5;
		edades[2][1] = 6;


		
		String frutas[][] = {{"Naranja","Limon"},{"Frutilla","Banana"},{"Kiwi","Melon"}};

	
	
	Persona personas [][]= new Persona [3][2];
	
	personas[0][0] = new Persona("Javier");
	personas[0][1] = new Persona("Jordana");
	personas[1][0] = new Persona("Jorge");
	personas[1][1] = new Persona("Eva");
	personas[2][0] = new Persona("Mati");
	personas[2][1] = new Persona("Seba");
	
	
	
	imprimir(personas);
	imprimir(frutas);
	
	}
	public static void imprimir(Object matriz[][]) {
		for (int filas =0 ; filas<matriz.length; filas++) {
			for (int columnas=0; columnas<matriz[filas].length; columnas++) {
				System.out.println("Fila: "+filas + " - Columna: "+columnas+" = "+matriz[filas][columnas]);
			}
		}
		
	}
}
