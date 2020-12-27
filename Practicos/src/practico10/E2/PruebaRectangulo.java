package practico10.E2;

public class PruebaRectangulo {

	public static void main(String[] args) {

		Rectangulo rectangulo1 = new Rectangulo(20, 5);
		Rectangulo rectangulo2 = new Rectangulo(8, 15);

		rectangulo1.darValores();
		rectangulo2.darValores();
		System.out.println(rectangulo2.calcularArea());
		System.out.println(rectangulo2.calcularPerimetro());
		System.out.println(rectangulo1.calcularArea());
		System.out.println(rectangulo1.calcularPerimetro());
		rectangulo1.tipoRectangulo();
		rectangulo2.tipoRectangulo();
		rectangulo2.dibujarRectangulo();
		rectangulo1.dibujarRectangulo();
		
	}

}
