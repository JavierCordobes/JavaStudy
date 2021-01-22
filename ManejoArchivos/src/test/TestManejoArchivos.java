package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
	public static void main(String[] args) {

		var nombreArchivo = "prueba.txt";
		// crearArchivo(nombreArchivo);

		// escribirArchivo(nombreArchivo, "Escribiendo archivo desde Java");
		// anexarInformacion(nombreArchivo, "Escribiendo otra linea en el archivo");
		// anexarInformacion(nombreArchivo, "Escribiendo una tercer linea");
		leerArchivo(nombreArchivo);

	}
}
