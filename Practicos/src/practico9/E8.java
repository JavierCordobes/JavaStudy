package practico9;

public class E8 {
	public static void main(String[] args) {
		
		int sumaImpar=0;
		for (; sumaImpar<=25 ;) {
			int n = (int)(Math.random()*11);
			
			if(n%2==0) {
				System.out.println(n+" - PAR");
			}else {
				System.out.println(n+" - IMAR");
				sumaImpar=sumaImpar+n;
			}
		}
		System.out.println("Se detubo por la suma de los impares supero 25");
		System.out.println("Suma Impar: "+sumaImpar);

		
	}
}
