package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
	public static void crearArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}
	}

	public static void escribirArchivo(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha escrito a el archivo");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}
	}

	public static void anexarInformacion(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha escrito a el archivo");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
}
