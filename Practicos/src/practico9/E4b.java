package practico9;

public class E4b {
	public static void main(String[] args) {
		int contadorPares = 0;
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 11);
			
			if (n == 0) {
				break;
			} else if (n % 2 == 0) {
				contadorPares++;
				System.out.println(n);
			}
		}
		System.out.println("pares: "+contadorPares);

	}
}
