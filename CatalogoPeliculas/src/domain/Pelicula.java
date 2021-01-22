package domain;

public class Pelicula {
	private String nombre;
	private String id;

	public Pelicula() {
	}

	public Pelicula(String nombre, String id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getId() {
		return this.id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return nombre + " -" + id;
	}

}
