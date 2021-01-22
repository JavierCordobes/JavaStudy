package practico8;

public class E2 {
	public static void main(String[] args) {
		
		int a = (int) (Math.random() * 1000);
		System.out.println("a: "+a);
		int b = (int)(Math.random()*1000);
		System.out.println("b: "+b);
		
		if (a==b) {
			System.out.println("Los numeros son Iguales");
		}else if(a>b){
			System.out.println("El numero mayor es el a: " +a);
		}else {
			System.out.println("El numero mayor es el b: "+b);
		}
		
		
	}

}
