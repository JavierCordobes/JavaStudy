package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import domain.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;

public class AccesoDatosImp implements AccesoDatos {

	@Override
	public boolean existe(String nombreArchivo) {
		var archivo = new File(nombreArchivo);
		return archivo.exists();
	}

	@Override
	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
		var archivo = new File(nombreArchivo);
		List<Pelicula> lista = new ArrayList<>();
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			var lectura = entrada.readLine();
			while (lectura != null) {
				String[] parts = lectura.split("-");
				String part1 = parts[0];
				String part2 = parts[1];
				lista.add(new Pelicula(part1, part2));
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al Listar Peliculas: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al Listar Peliculas: " + e.getMessage());
		}
		return lista;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
			salida.println(pelicula.toString());
			salida.close();
			System.out.println("Se agrego pelicula");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			throw new EscrituraDatosEx("Excepcion al Escribir Pelicula: " + ex.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new EscrituraDatosEx("Excepcion al Escribir Pelicula: " + e.getMessage());
		}
	}

	@Override
	public List<Pelicula> buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
		var archivo = new File(nombreArchivo);
		List<Pelicula> buscadas = new ArrayList<>();
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			var lectura = entrada.readLine();
			while (lectura != null) {
				if (lectura.contains(buscar)) {
					String[] parts = lectura.split("-");
					String part1 = parts[0];
					String part2 = parts[1];
					buscadas.add(new Pelicula(part1, part2));
				}
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al Buscar Peliculas: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al Buscar Peliculas: " + e.getMessage());
		}
		return buscadas;
	}

	@Override
	public void crear(String nombreArchivo) throws AccesoDatosEx {
		var archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new AccesoDatosEx("Excepcion creando Archivo " + e.getMessage());
		}

	}

	@Override
	public void borrar(String nombreArchivo) {
		var archivo = new File(nombreArchivo);
		if (archivo.exists()) {
			archivo.delete();
			System.out.println("Se borro el archivo");
		}
	}
}
