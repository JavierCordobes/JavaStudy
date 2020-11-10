package dominio;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean eliminado;
	
	
	public void imprimirDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Eliminado: " + eliminado);
	}
	
	public Persona(String nombre, String apellido, int edad, boolean eliminado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.eliminado = eliminado;
	}
	public String toString() {
		return "Persona [nombre: " +this.nombre +
				", apellido: " + this.apellido +
				", edad: " + this.edad +
				", elimiado: " +this.eliminado +"]";
	}
	

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return this.edad;

	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEliminado() {
		return this.eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	

}
