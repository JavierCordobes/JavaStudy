package operaciones;

public class Aritmetica {
	// Atributos de la calse
	int a;
	int b;

	// Constructor vacio
	public Aritmetica() {
		System.out.println("Ejecutando constructor vacio");
	}
	
	public Aritmetica(int a, int b) {
		System.out.println("Ejecutando constructor con Argumentos");
		this.a= a;
		this.b= b;
	}

	// Metodos
	public void sumar() {
		int resultado = this.a + this.b;
		System.out.println("resultado: " + resultado);
	}

	public int sumarConRetorno() {
		return a + b;

	}

	public int sumarConArgumentos(int a, int b) {
		this.a = a;// El argumento a se asigna al atributo this.a
		this.b = b;
		// return a + b;
		return this.sumarConRetorno();

	}

}
