package practico9;

public class E3 {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 9 + 1);
		System.out.println("n: " + n);

		for (int i = 1; i <= 50; i++) {
			if ((n * i) < 50) {
				System.out.println(n * i);
			}

		}
	}
}
