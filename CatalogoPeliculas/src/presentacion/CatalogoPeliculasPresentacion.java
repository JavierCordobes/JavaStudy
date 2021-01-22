package presentacion;

import java.util.Scanner;
import negocio.*;

public class CatalogoPeliculasPresentacion {
	public static void main(String[] args) {
		var opcion = -1;
		var scanner = new Scanner(System.in);
		CatalogoPeliculas catalogo = new CatalogosPeliculasImp();

		while (opcion != 0) {
			System.out.println("Elige una opcion: \n" + "1. Iniciar catalogo peliculas\n" + "2. Agregar pelicula\n"
					+ "3. Listar peliculas\n" + "4. Buscar pelicula\n" + "0. Salir");
			opcion = Integer.parseInt(scanner.nextLine());

			switch (opcion) {
			case 1: {
				catalogo.inciciarArchivo();
				break;

			}
			case 2: {
				System.out.println("Ingrese nombre de pelicula: ");
				var nombrePelicula = scanner.nextLine();
				System.out.println("Ingrese Id de pelicula: ");
				var id = scanner.nextLine();
				catalogo.agregarPelicula(nombrePelicula, id);
				break;

			}
			case 3: {
				catalogo.listarPeliculas();
				break;

			}
			case 4: {
				System.out.println("Ingrese Pelicula a buscar: ");
				var buscar = scanner.nextLine();
				catalogo.buscarPelicula(buscar);
				break;

			}
			case 0: {
				System.out.println("Hasta Pronto!");
				break;
			}
			default:
				System.out.println("Opcion no reconocida");
				break;
			}

		}
	}
}
