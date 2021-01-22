package ej3;

public class Rectangulo extends Cuadrilatero {
	private double ladoUno;
	private double ladoDos;

	public Rectangulo(double ladoUno, double ladoDos) {
		this.ladoUno = ladoUno;
		this.ladoDos = ladoDos;
	}

	@Override
	public String darNombre() {
		return "Rectangulo";
	}

	@Override
	public double calcularArea() {
		return ladoUno * ladoDos;
	}

}
