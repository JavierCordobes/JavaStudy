package ej3;

public class Ejercicio3 {
	public static void main(String[] args) {
		ColeccionCuadrilateros cuadrilateros = new ColeccionCuadrilateros();
		
		Cuadrilatero cuadrado1 = new Cuadrado(Math.random()*10);
		Cuadrilatero cuadrado2 = new Cuadrado(Math.random()*10);
		Cuadrilatero rectangulo1 = new Rectangulo(Math.random()*10, Math.random()*10);
		Cuadrilatero rectangulo2 = new Rectangulo(Math.random()*10, Math.random()*10);
		Cuadrilatero rombo1= new Rombo(Math.random()*10, Math.random()*10);
		Cuadrilatero rombo2= new Rombo(Math.random()*10, Math.random()*10);
		
		cuadrilateros.agregarCuadrilatero(cuadrado1);
		cuadrilateros.agregarCuadrilatero(cuadrado2);
		cuadrilateros.agregarCuadrilatero(rectangulo1);
		cuadrilateros.agregarCuadrilatero(rectangulo2);
		cuadrilateros.agregarCuadrilatero(rombo1);
		cuadrilateros.agregarCuadrilatero(rombo2);
		
		cuadrilateros.recorrerColeccion();
		
	
	}
}
