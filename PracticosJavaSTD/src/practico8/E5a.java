package practico8;

public class E5a {

	public static void main(String[] args) {

		int nota = (int) (Math.random() * 13);
		System.out.println("Nota: " + nota);

		if (nota <= 3) {
			System.out.println("Reprobado");
		} else if (nota <= 7) {
			System.out.println("Aceptable");
		} else if (nota <= 11) {
			System.out.println("Bueno");
		} else {
			System.out.println("Excelente");
		}

	}

}
