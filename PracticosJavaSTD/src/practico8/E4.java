package practico8;

public class E4 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 1000);
		System.out.println("a: " + a);

		int b = (int) (Math.random() * 1000);
		System.out.println("b: " + b);

		if (b != 0) {
			int cociente = a / b;
			System.out.println("cociente: " + cociente);

			int resto = a % b;
			System.out.println("resto: " + resto);
		}else {
			System.out.println("ERROR! b es igual a 0");
		}

	}

}
