package practico13.E1;

public class P12E1 {

	public static void main(String[] args) {

		double[] arre = new double[4];
		for (int i = 0; i < arre.length; i++) {
			arre[i] = 2 * i;
			System.out.println(arre[i]);
		}
		for (int i = arre.length - 1; i >= 0; i--) {
			arre[i] = arre.length - arre[i];
			System.out.println(arre[i]);
		}
	}
}

/* 
0
2
4
6
-2
0
2
4

*/