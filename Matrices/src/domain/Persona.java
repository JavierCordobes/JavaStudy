package domain;

public class Persona {
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre+"   ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
