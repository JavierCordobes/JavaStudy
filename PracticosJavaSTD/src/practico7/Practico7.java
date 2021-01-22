package practico7;

public class Practico7 {

	public static void main(String[] args) {

	/////////////////////////////////////////////////
		/*1
	 
	 a 150
	 b 50
	 c 500
	 d 2
	 e 0
	 f 2
	 g 101
	 h 99
	 i false
	 j false
	 k true
	 l true
	 m true
	 n false
	 o true
	 p true
	 q false
	 r false
	 s true
	 t false
	 u true
	 v false
	 w true
	 x true
	 y false
	  
	  
	//////////////////////////////////////  
	  
	  2
	  
	  y = 2
	  c = false
	  a = false
	  b = true
	  x = 2
	 
	  int x;
		int y = 1;
		boolean b;
		boolean c = true;
		boolean a = false;
		x = 0;
		x ++;
		y = x + y;
		b = x < y;
		x = 5 * y;
		c = (!b);
		x = y % 3;
		y = x; 
	  
	  
	  
	 *//////////////////////////////////////////////
		
	/*3
		int num1,num2;
		int azar = (int) (Math.random()*100);
		num1 = azar;
		System.out.println("num1: "+num1);
		num2 = num1 % 5;
		
		num1 = num1+num2;
		System.out.println("num1: " +num1 + " num2: " +num2);
	
		*/
	////////////////////////////////////////////////////////////
	
		
		//4a  
		/*
		double precio;
		final double  IVA = 0.22;
		double azar = (int) (Math.random()*1000);
		
		precio =azar;
		double precioIva = precio * IVA;
		double precioFinal = precio+precioIva;
		
		System.out.println("El precio del articulo es: "+precio);
		System.out.println("El IVA del articulo es : "+precioIva);
		System.out.println("El precio final del articulo es: "+ precioFinal);
		*/
		
		//4b
		/*
		double radio = (int)(Math.random()*50);
		System.out.println("radio: "+radio);
		double area = radio * radio * Math.PI;
		System.out.println("area: "+area);
		*/
		
		//4c
		
		int alfa = (int)(Math.random()*1000);
		System.out.println("alfa: " +alfa);
		int beta = (int)(Math.random()*1000);
		System.out.println("beta: " +beta);
		
		int aux = alfa;
		alfa = beta;
		beta=aux;
		
		System.out.println("alfa: " +alfa);
		System.out.println("beta: " +beta);		
		
		

	}

}
