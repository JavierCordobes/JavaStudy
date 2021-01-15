package ej2;

public class Persona {
	private long cedula;
	private String nombre;
	
	public Persona(long cedula, String nombre) {
		this.cedula=cedula;
		this.nombre=nombre;
	}
	
	public long getCedula() {
		return this.cedula;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setCedula(long cedula) {
		this.cedula=cedula;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + "]";
	}
	
	
}
