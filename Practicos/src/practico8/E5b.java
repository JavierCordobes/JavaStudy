package practico8;

public class E5b {

	public static void main(String[] args) {
		for (int i = 0; i < 9999; i++) {
			int nota = (int) (Math.random() * 13);
			System.out.println("Nota: " + nota);

			switch (nota) {
			case 0:
			case 1:
			case 2:
			case 3:
				System.out.println("Reprobado");
				break;
			case 4:
			case 5:
			case 6:
			case 7:
				System.out.println("Aceptable");
				break;
			case 8:
			case 9:
			case 10:
			case 11:
				System.out.println("Bueno");
				break;
			case 12:
				System.out.println("Excelente");
				break;

			}
		}

	}

}
