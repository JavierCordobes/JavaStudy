package practico9;

public class E7 {
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*10+1);
		System.out.println("a: "+a);
		int b = (int)(Math.random()*(50-20+1)+20);
		System.out.println("b: "+b);

		for (int i = 1; i<=b;i++) {
			if(i%a==0) {
				System.out.println(i);
			}
		}
		
		
	}
}
