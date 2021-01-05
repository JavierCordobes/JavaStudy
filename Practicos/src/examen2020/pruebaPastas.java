package examen2020;

public class pruebaPastas {

	public static void main(String[] args) {

		TodasLasPastas pastas = new TodasLasPastas(10);

		Pasta p1 = new Pasta("spaguetti", 001, 150, "Kilo");
		Pasta p2 = new Pasta("tallarin", 002, 200, "Kilo");
		Pasta p3 = new PastaRellena("raviol", 003, 250, "50 unidades", "Acelga", true);
		Pasta p4 = new PastaRellena("sorrentino", 004, 30, "unidad ", "jamon y queso", false);
		
		pastas.agregarPasta(p1);
		pastas.agregarPasta(p2);
		pastas.agregarPasta(p3);
		pastas.agregarPasta(p4);
		
		p1.mostrarInfo();
		Pasta pasta = pastas.retornaPasta(3);
		pasta.mostrarInfo();
		
		pastas.mostrarTodas();
		
		System.out.println(pastas.cuantasVegeta());
		
		
		
	}

}
