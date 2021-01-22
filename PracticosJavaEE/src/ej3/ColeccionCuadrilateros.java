package ej3;

import java.util.ArrayList;

public class ColeccionCuadrilateros {
	ArrayList<Cuadrilatero> cuadrilateros;

	public ColeccionCuadrilateros() {
		cuadrilateros = new ArrayList<Cuadrilatero>();
	}
	
	public void agregarCuadrilatero(Cuadrilatero c) {
		cuadrilateros.add(c);
	}
	
	public void recorrerColeccion() {
		for (Cuadrilatero c:cuadrilateros) {
			System.out.println("Area del "+c.darNombre()+ ": "+c.calcularArea()+" m2" );
		}
	}
	
}