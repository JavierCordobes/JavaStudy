package practico14;

import practico14.Rectangulo;

public class PruebaColRectangulos {

	public static void main(String[] args) {

		ColeccionRectangulos coleccion1 = new ColeccionRectangulos(10);
	
		
	
		coleccion1.darValores();
		int mayorArea = coleccion1.posicionRectanguloMayorArea();
		System.out.println("El rectangulo de mayor area es el de la posicion " + mayorArea);
		
		coleccion1.dibujarRectangulos();
		if (coleccion1.hayMasHorizontales()==true) {
			System.out.println("Hay mas Horizontales");
		}else {
			System.out.println("Hay mas Verticales");
		}
		
		
		
	}

}
