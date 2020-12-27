package practico8;

public class E6 {

	public static void main(String[] args) {

		double capacidad = Math.random() * 1;
		System.out.println("Capacidad: " + capacidad);

		if (capacidad <= 0.3) {
			System.out.println("Vacia");

		} else if (0.4 <= capacidad && capacidad <= 0.7) {
			System.out.println("Media");

		} else if (0.8 <= capacidad && capacidad <= 1) {
			System.out.println("Lena");
		}else {
			System.out.println("Cantidad no controlada");
		}

	}
}
