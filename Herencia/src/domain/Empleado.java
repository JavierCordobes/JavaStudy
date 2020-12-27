package domain;

public class Empleado extends Persona {

	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;

	public Empleado() {
		this.idEmpleado = ++Empleado.contadorEmpleado;
	}

	public Empleado(String nombre, double sueldo) {
		this();
		this.nombre = nombre;
		this.sueldo = sueldo;

	}

	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", sueldo=");
		builder.append(this.sueldo);
		builder.append(", nombre=");
		builder.append(this.nombre);
		builder.append("]");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
