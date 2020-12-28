package domain;

public class Orden {

	private int IdOrden;
	private Producto productos[]; // arreglo de productos
	private static int contadorOrdenes; // contador de ordenes para incrementar id
	private int contadorProductos; // contador de productos agergados a la orden para usar como limites de array
	public static final int MAXPRODUCTOS = 20;

	public Orden() {
		Orden.contadorOrdenes++;
		this.IdOrden = Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAXPRODUCTOS];
	}

	public void agregarProducto(Producto producto) {
		if (this.contadorProductos < Orden.MAXPRODUCTOS) {
			this.productos[this.contadorProductos++] = producto;
		} else {
			System.out.println("Se superó la cantidad maxima de productos: " + MAXPRODUCTOS);
		}
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.contadorProductos; i++) {
			total = total + productos[i].getPrecio();
		}
		return total;
	}

	public void mostrarOrden() {
		System.out.println("Id Orden: "+this.IdOrden);
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(this.productos[i]);
		}
		System.out.println("Total de la orden: "+this.calcularTotal());
	}

}
