package examen2020;

public class TodasLasPastas {
	private Pasta[] arreglo;
	private int tope;

	public TodasLasPastas(int tamanio) {
		this.arreglo = new Pasta[tamanio];
		tope = 0;
	}

	public boolean existePasta(int codigo) {
		boolean existe = false;

		for (int i = 0; i < tope; i++) {
			if (arreglo[i].getCodigo() == codigo) {
				existe = true;
			}
		}
		return existe;
	}

	public Pasta retornaPasta(int codigo) {
		Pasta pasta = null;
		if (existePasta(codigo)) {
			for (int i = 0; i < tope; i++) {
				if (arreglo[i].getCodigo() == codigo) {
					pasta = arreglo[i];
				}
			}
		}
		return pasta;
	}

	public void agregarPasta(Pasta pasta) {
		if (existePasta(pasta.getCodigo()) == false) {
			this.arreglo[this.tope] = pasta;
			tope++;
		}
	}

	public void mostrarTodas() {
		for (int i = 0; i < tope; i++) {
			arreglo[i].mostrarInfo();
		}
	}

	public int cuantasVegeta() {
		int vegetas = 0;
		for (int i = 0; i < tope; i++) {
			if (arreglo[i] instanceof PastaRellena && ((PastaRellena) arreglo[i]).isVegetariana()) {
				vegetas++;
			}
		}
		return vegetas;
	}

}
