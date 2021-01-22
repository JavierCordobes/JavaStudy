package practico9;

public class E11 {
	public static void main(String[] args) {
		int m = (int) (Math.random() * 10 + 1);
		System.out.println(m);
		int n = (int) (Math.random() * 30 + 1);
		System.out.println(n);

		for (int i = 0; i < m; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
