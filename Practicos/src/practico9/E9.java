package practico9;

public class E9 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 30 + 1);
		System.out.println(a);
		int b = (int) (Math.random() * 30 + 1);
		System.out.println(b);

		int pot = (int) Math.pow(a, b);
		System.out.println("la potencia es: " + pot);
	}
}
