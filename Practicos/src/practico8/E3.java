package practico8;

public class E3 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 1000);
		System.out.println("a: " + a);
		int b = (int) (Math.random() * 1000);
		System.out.println("b: " + b);
		int c = (int) (Math.random() * 1000);
		System.out.println("c: " + c);

		if (a == b && b == c) {
			System.out.println("Los 3 numeros son Iguales");
		} else if (a > b && a > c) {
			System.out.println("El numero mayor es el a: " + a);
		} else if (c > a && c > b) {
			System.out.println("El numero mayor es el c: " + c);
		} else if (b > a && b > c) {
			System.out.println("El numero mayor es el b: " + b);
		}

	}
}
