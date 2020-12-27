package practico9;

public class E12 {

	public static void main(String[] args) {

		int m = (int) (Math.random() * 30 + 1);
		System.out.println(m);

		for (; m >= 0; m--) {
			for (int i = 0; m >= i; i++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
}
