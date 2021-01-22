package negocio;

import datos.AccesoDatos;
import datos.AccesoDatosImp;
import domain.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;

public class CatalogosPeliculasImp implements CatalogoPeliculas {
	private final AccesoDatos datos;

	public CatalogosPeliculasImp() {
		this.datos = new AccesoDatosImp();
	}

	@Override
	public void agregarPelicula(String nombrePelicula, String id) {
		Pelicula pelicula = new Pelicula(nombrePelicula, id);
		boolean anexar = false;
		try {
			anexar = datos.existe(RECURSO);
			datos.escribir(pelicula, RECURSO, anexar);
		} catch (EscrituraDatosEx e) {
			System.out.println("Error de acceso a datos: ");
			e.printStackTrace(System.out);
		}

	}

	@Override
	public void listarPeliculas() {
		try {
			if (datos.existe(RECURSO)) {
				System.out.println(datos.listar(RECURSO));
			} else
				System.out.println("No existe catalogo para listar");
		} catch (LecturaDatosEx e) {
			System.out.println("Error lectura datos: ");
			e.printStackTrace(System.out);
		}

	}

	@Override
	public void buscarPelicula( String buscar) {
		try {
			if (datos.existe(RECURSO)) {
				System.out.println(datos.buscar(RECURSO, buscar));
			}
		} catch (LecturaDatosEx e) {
			System.out.println("Error lectura datos: ");
			e.printStackTrace(System.out);
		}
	}

	@Override
	public void inciciarArchivo() {
		if (datos.existe(RECURSO)) {
			datos.borrar(RECURSO);
			try {
				datos.crear(RECURSO);
			} catch (AccesoDatosEx e) {
				System.out.println("Error de acceso a datos: ");
				e.printStackTrace(System.out);
			}
		}

	}

}
