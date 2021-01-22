package practico14;

import java.util.ArrayList;

public class ColeccionRectangulos {

	private Rectangulo[] arreglo;

	public ColeccionRectangulos(int cantidadCeldas) {

		arreglo = new Rectangulo[cantidadCeldas];

		for (int i = 0; i < cantidadCeldas; i++) {
			arreglo[i] = (new Rectangulo((int) (Math.random() * 11), (int) (Math.random() * 9)));

		}
	} 

	public int posicionRectanguloMayorArea() {
		int mayorArea = 0;
		int posicion = 0;
		for (int i = 0; i < arreglo.length; i++) {

			if (arreglo[i].calcularArea() > mayorArea) {
				mayorArea = arreglo[i].calcularArea();
				posicion = i;
			}
		}
		return posicion;
	}

	public void darValores() {
		for (Rectangulo r : arreglo) {
			r.darValores();
		}
	}

	public void dibujarRectangulos() {
	
		for (Rectangulo r : arreglo) {

			r.darValores();
			r.dibujarRectangulo();
		

		}
	}

	public boolean hayMasHorizontales() {

		int horizontales = 0;
		int verticales = 0;
		for (Rectangulo r : arreglo) {
			if (r.tipoRectangulo() == "Horizontal") {
				horizontales++;
			} else if (r.tipoRectangulo() == "Vertical") {
				verticales++;
			}
		}
		return (horizontales > verticales);
	}

}
