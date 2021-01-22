package ej3;

public class Cuadrado extends Cuadrilatero {
	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public String darNombre() {
		return "Cuadrado";
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

}
