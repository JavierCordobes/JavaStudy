package ejercicio;

public class Caja {
	//atributos de clase
	int largo;
	int ancho;
	int alto;
	
	//metodo constructor vacio
	public Caja() {
		System.out.println("Ejecutando contructor Vacio");
	}
	
	//metodo constructor con arg
	public Caja(int largo, int ancho, int alto) {
		System.out.println("Ejecutando constructor con args");
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public int calcularVolumen() {
		return largo * ancho * alto;
	}
	
	
	
	

}
