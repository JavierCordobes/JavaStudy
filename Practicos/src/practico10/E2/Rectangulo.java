package practico10.E2;

public class Rectangulo {
	int largo;
	int ancho;

	// constructor sin parametros que inicializa con default de valores
	public Rectangulo() {
		largo = 1;
		ancho = 1;
	}

	// constructor que recibe parametros y chequea que sean positivos, sino inicia
	// en default
	public Rectangulo(int largo, int ancho) {

		if (largo > 0) {
			this.largo = largo;
		} else {
			this.largo = 1;
		}
		if (ancho > 0) {
			this.ancho = ancho;
		} else {
			this.ancho = 1;
		}
	}

	public int getLargo() {
		return this.largo;
	}

	public int getAncho() {
		return this.ancho;
	}

	public void setLargo(int largo) {
		if (largo > 0) {
			this.largo = largo;
		}
	}

	public void setAncho(int ancho) {
		if (ancho > 0) {
			this.ancho = ancho;
		}
	}

	public int calcularArea() {
		return largo * ancho;
	}

	public int calcularPerimetro() {
		return (2 * largo) + (2 * ancho);
	}

	public String tipoRectangulo() {
		String tipoRectangulo;
		if (largo > ancho) {
			tipoRectangulo = "Horizontal";
		} else if (ancho > largo) {
			tipoRectangulo = "Vertical";
		} else {
			tipoRectangulo = "Cuadrado";
			System.out.println(tipoRectangulo);

		}
		System.out.println(tipoRectangulo);
		return tipoRectangulo;
	}

	public void darValores() {
		System.out.println("Largo = " + largo + " - " + "Ancho = " + ancho);
	}

	public void dibujarRectangulo() {

		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
