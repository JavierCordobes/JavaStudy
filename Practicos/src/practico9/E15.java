package practico9;

public class E15 {
	public static void main(String[] args) {
		int num = 1;
		while (num > 0) {
			if (num % 2 == 0)
				num = num - 1;
			else
				num = num + 1;
			System.out.println(num);
		}
	}
}
// entra en un looping porque suma 1 a num y luego resta 1 a num
