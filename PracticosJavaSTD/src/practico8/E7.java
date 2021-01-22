package practico8;

public class E7 {
	public static void main(String[] args) {
		int dia = (int) (Math.random() * 8);
		double hora = Math.random() * 24;
		System.out.println("Dia: " + dia + " Hora: " + hora);

		switch (dia) {
		case 5:
			if (hora < 16) {
				System.out.println("Menu: Pollo");
			} else {
				System.out.println("Menu: Ensaldas");
			}
			break;

		case 6:
			if (hora < 12) {
				System.out.println("Menu: Carnes");
			} else if (hora < 20) {
				System.out.println("Menu: Minutas");
			}
			break;

		case 7:
			System.out.println("Menu: Pastas");
			break;
		default:
			System.out.println("Gracias, Vuelva otro dia");
		}

	}

}
