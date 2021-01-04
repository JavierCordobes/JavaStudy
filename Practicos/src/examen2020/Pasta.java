package examen2020;

public class Pasta {
	protected String tipo;
	protected int codigo;
	protected double precio;
	protected String medida;

	public Pasta(String tipo, int codigo, double precio, String medida) {
		this.tipo = tipo;
		this.codigo = codigo;
		this.precio = precio;
		this.medida = medida;

	}

	public void mostrarInfo() {
		System.out.println("Tipo: " + tipo);
		System.out.println("Codigo: " + codigo);
		System.out.println("Precio: " + precio);
		System.out.println("medida: " + medida);
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMedida() {
		return this.medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}
}
