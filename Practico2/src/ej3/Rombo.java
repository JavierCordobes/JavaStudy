package ej3;

public class Rombo extends Cuadrilatero {
	private double diagonalUno;
	private double diagonalDos;

	public Rombo(double diagonalUno, double diagonalDos) {
		this.diagonalUno = diagonalUno;
		this.diagonalDos = diagonalDos;
	}

	public String darNombre() {
		return "Rombo";
	}

	public double calcularArea() {
		return (diagonalUno * diagonalDos) / 2;
	}

}
