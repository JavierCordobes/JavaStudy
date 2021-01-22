package examen2020;

public class PastaRellena extends Pasta {
	private String tipoRelleno;
	private boolean vegetariana;

	public PastaRellena(String tipo, int codigo, double precio, String medida, String tipoRelleno,
			boolean vegetariana) {
		super(tipo, codigo, precio, medida);
		this.tipoRelleno = tipoRelleno;
		this.vegetariana = vegetariana;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tipo relleno: " + tipoRelleno);
		if (this.vegetariana == true) {
			System.out.println("Es vegetariana");
		} else {
			System.out.println("No es vegetariana");
		}
	}

	public String getTipoRelleno() {
		return this.tipoRelleno;
	}

	public void setTipoRelleno(String tipoRelleno) {
		this.tipoRelleno = tipoRelleno;
	}

	public boolean isVegetariana() {
		return this.vegetariana;
	}

	public void setVegetariana(boolean vegetariana) {
		this.vegetariana = vegetariana;
	}
}
