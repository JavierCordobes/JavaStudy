package negocio;

public interface CatalogoPeliculas {

	String RECURSO = "peliculas.txt";

	public void agregarPelicula(String nombrePelicula, String id);

	public void listarPeliculas();

	public void buscarPelicula( String buscar);

	public void inciciarArchivo();
}
