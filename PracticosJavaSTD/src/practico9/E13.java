package practico9;

public class E13 {
	public static void main(String[] args) {
		int a = 3, b = 2;
		boolean termine = false;
		do {
			if (a % b == 0)
				termine = true;
			else {
				a = a + b;
				b = b + 1;
			}
			System.out.println(a);
			System.out.println(b);
		} while (termine == false);
	}
}
/*
a 3
b 2

a 8
b 4




//////
5
3
8
4
8
4



*/