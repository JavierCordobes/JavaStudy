package test;

// import completo de paquete
//import javastudy.*;

// import de clase
//import javastudy.Utileria;

import static javastudy.Utileria.Imprimir;

public class TestUtileria {
	public static void main(String[] args) {

		// uso del metodo abstracto imprimir indicando la clase Utileria
		// Utileria.Imprimir("Saludos");

		// uso del metodo abstracto imprimir directo por tener el import static
		Imprimir("CHAU");
		
		// uso de metodo mediante nombre totalmente cualificado
		javastudy.Utileria.Imprimir("Chau desde nombre totalemte cualificado");
		
	}
}
