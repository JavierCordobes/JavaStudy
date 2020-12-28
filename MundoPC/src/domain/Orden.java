package domain;

public class Orden {
	private final int idOrden;
	private Computadora[] computadoras;
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private final static int MAXCOMPUTADORAS = 10;

	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadoras = new Computadora[Orden.MAXCOMPUTADORAS];
	}
	
	public void agregarComputadora(Computadora computadora) {
		if(this.contadorComputadoras<Orden.MAXCOMPUTADORAS) {
			this.computadoras[this.contadorComputadoras++]=computadora;
		}else {
			System.out.println("Ya se alcanzo el maximo de computadoras por orden: "+MAXCOMPUTADORAS);
		}
	}
	public void mostrarOrden() {
		System.out.println("IdOrden: "+this.idOrden);
		for (int i= 0; i<this.contadorComputadoras; i++) {
			System.out.println(this.computadoras[i]);
		}
		
	}
	
}
