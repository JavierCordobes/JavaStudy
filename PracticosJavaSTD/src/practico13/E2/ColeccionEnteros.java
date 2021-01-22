package practico13.E2;

public class ColeccionEnteros {

	private int[] arreglo;

	public ColeccionEnteros(int tamanio) {
		this.arreglo = new int[tamanio];

		for (int i = 0; i < this.arreglo.length; i++) {
			this.arreglo[i] = (int) (Math.random() * 101);
		}

	}

	public void desplegarColeccion() {
		for (int i = 0; i < this.arreglo.length; i++) {
			System.out.println("Posicion " + i + " - numero " + this.arreglo[i]);
		}
	}

	public boolean existeValor(int valor) {
		boolean existe = false;

		for (int i = 0; i < this.arreglo.length; i++) {
			if (this.arreglo[i] == valor) {
				existe = true;
			}
		}
		return existe;
	}

	public int maximoValor() {
		int maximo = 0;
		for (int i = 0; i < this.arreglo.length; i++) {
			if (this.arreglo[i] > maximo) {
				maximo = this.arreglo[i];
			}
		}
		return maximo;
	}

	public void desplegarPosicionesMultiplo(int num) {
		boolean hayMultiplo = false;
		for (int i = 0; i < this.arreglo.length; i++) {
			if (this.arreglo[i] != 0 && this.arreglo[i] % num == 0) {
				System.out.println(this.arreglo[i] + " Es multiplo de " + num);
				hayMultiplo = true;
			}
		}
		if (hayMultiplo == false) {
			System.out.println("No existen multiplos de " + num);

		}
	}

	public double promedioValores() {

		int contador = 0;
		int suma = 0;
		for (int i = 0; i < this.arreglo.length; i++) {
			suma = this.arreglo[i] + suma;
			contador++;
		}
		double promedio = (double) suma / contador;
		return promedio;
	}

	public void invertir() {
		int[] aux = new int[this.arreglo.length];
		int j = 0;
		for (int i = this.arreglo.length - 1; i >= 0; i--) {

			aux[j] = this.arreglo[i];
			j++;
		}
		arreglo = aux;
	}

	public void duplicarCeldasMultiplo(int valor) {
		for (int i = 0; i < this.arreglo.length; i++) {
			if (this.arreglo[i] != 0 && this.arreglo[i] % valor == 0) {
				System.out.println("Se duplica el numero " + arreglo[i] + " por ser multiplo de " + valor);
				this.arreglo[i] = this.arreglo[i] * 2;

			}
		}
	}

	public boolean hayRepetidos() {
		boolean hayRepetidos = false;
		int aux;
		for (int i = 0; i < this.arreglo.length; i++) {
			aux = arreglo[i];
			for (int j = i + 1; j < this.arreglo.length; j++) {
				if (arreglo[j] == aux) {
					hayRepetidos = true;
				}
			}
		}
		return hayRepetidos;
	}

}
