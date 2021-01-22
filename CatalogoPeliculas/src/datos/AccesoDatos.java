package datos;

import java.util.List;

import domain.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;

public interface AccesoDatos {

	public boolean existe(String nombreArchivo);

	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

	public List<Pelicula> buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

	public void crear(String nombreArchivo) throws AccesoDatosEx;

	public void borrar(String nombreArchivo);

}
