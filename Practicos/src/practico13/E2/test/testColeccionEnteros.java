package practico13.E2.test;

import practico13.E2.ColeccionEnteros;

public class testColeccionEnteros {

	public static void main(String[] args) {
		
		ColeccionEnteros coleccion1=new ColeccionEnteros(10);
		coleccion1.desplegarColeccion();
		coleccion1.existeValor(10);
		coleccion1.maximoValor();
		coleccion1.desplegarPosicionesMultiplo(5);
		coleccion1.promedioValores();
		
		coleccion1.invertir();
		coleccion1.hayRepetidos();
		coleccion1.duplicarCeldasMultiplo(5);
		coleccion1.desplegarColeccion();
	}

}
