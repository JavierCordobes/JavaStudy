package practico9;

public class E6 {
	public static void main(String[] args) {
		int dia = (int) (Math.random() * 31 + 1);
		int mes = (int) (Math.random() * 12 + 1);
		int anio = (int) (Math.random() * (2100 - 1900 + 1) + 1900);

		System.out.println("dia: " + dia);
		System.out.println("mes: " + mes);
		System.out.println("año: " + anio);

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es valida");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia <= 30) {
				System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es valida");
			} else {
				System.out.println("La fecha es invalida");
			}
			break;
		case 2:
			if (anio % 4 == 0) {
				if (dia <= 29) {
					System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es valida");
					break;
				} else {
					System.out.println("La fecha es invalida");
				}
			}
			if (dia <= 28) {
				System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es valida");
			} else {
				System.out.println("La fecha es invalida");
			}
			break;
		}
	}
}
