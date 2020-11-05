package ejercicio;

public class PruebaCaja {
	public static void main(String[] args) {
		
		int medidaAlto = 1;
		int medidaAncho = 2;
		int medidaLargo = 3;
		
		Caja caja1 = new Caja();
		caja1.alto = medidaAlto;
		caja1.ancho = medidaAncho;
		caja1.largo = medidaLargo;		
		int volumen1 = caja1.calcularVolumen();
		System.out.println("volumen1 : " + volumen1);
		
		
		Caja caja2 = new Caja(5,5,2);
		int volumen2 = caja2.calcularVolumen();
		System.out.println("volumen2 : " + volumen2);
		
	}
}
