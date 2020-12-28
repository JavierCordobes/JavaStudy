package test;

import domain.Computadora;
import domain.Monitor;
import domain.Orden;
import domain.Raton;
import domain.Teclado;

public class TestMundoPC {

	public static void main(String[] args) {

		Computadora computadora1 = new Computadora("ITX Javier", new Monitor("Acer", 27),
				new Teclado("cableado", "Logitech"), new Raton("cableado", "Logitech"));
		Orden orden1= new Orden();
		Computadora computadora2= new Computadora("ITX Mati",new Monitor("Asus", 34),new Teclado("cableado","Asus"),new Raton("cableado","Asus"));
		
		orden1.agregarComputadora(computadora1);
		orden1.agregarComputadora(computadora2);
		orden1.mostrarOrden();
	}

}
