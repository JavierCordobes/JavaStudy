package Practico1;

public class EJ1 {

	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			int num1 = (int) (Math.random() * 100);
			int num2 = (int) (Math.random() * 100);
			
			try {
				int cociente =num1 / num2;
				System.out.println(num1 +" / "+num2 + " = "+cociente);
			} catch (ArithmeticException e) {
				System.out.println(num1 +" / "+num2 + " No se puede dividir entre 0 ");
			}

		}

	}
}
