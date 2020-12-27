package arreglos;

public class TestArreglos {
	public static void main(String[] args) {
		
		int edades[] = new int[3];
		
		System.out.println(edades);
		
		edades[0] = 10;
		edades[1] = 20;
		edades[2] = 30;
		
		// posicion por fuera del array
	//	edades[3] = 15;
		
		for(int i=0 ; i < edades.length ; i++) {
			System.out.println("edades elemento " +i + " = " + edades[i]);
		}
		
	}
	

}
