package test;

import domain.Orden;
import domain.Producto;

public class VentasTest {
	public static void main(String[] args) {
		Producto producto1= new Producto("Banana",50);
		Producto producto2= new Producto("Frutilla",70);

		
		Orden orden1= new Orden();
		
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.agregarProducto(new Producto("Alfajor",15));
		
		
		orden1.mostrarOrden();
		
		
	}
}
