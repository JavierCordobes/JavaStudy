package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
	public static double division(int numerador, int denominador) throws OperacionExcepcion {
		if (denominador == 0) {
			throw new OperacionExcepcion("Division entre cero");
		}
		return (double)numerador / denominador;
	}

}
