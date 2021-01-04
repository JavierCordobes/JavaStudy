package practico14;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	public void printPersona() {
		System.out.println(toString());
	}

	public int anioNacimiento(int anioActual) {
		return anioActual - edad;
	}

	public boolean esMasJoven(Persona persona) {
		if (edad < persona.getEdad()) {
			System.out.println("La persona mas joven es: "+nombre +" nacio en "+ anioNacimiento(2020));
			return true;
		} else {
			System.out.println("La persona mas joven es: "+persona.getNombre() +" con "+ +persona.anioNacimiento(2020));
			return false;
		}
	}

}
