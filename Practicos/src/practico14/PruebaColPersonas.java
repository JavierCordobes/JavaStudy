package practico14;

public class PruebaColPersonas{
	public static void main(String[] args) {
		ColeccionPersonas col1= new ColeccionPersonas(10);
		
		col1.insertarPersona(new Persona("Javier", "Cordobes", 32));
		col1.insertarPersona(new Persona("Jordana", "Abdul", 33));
		col1.insertarPersona(new Persona("Jorge", "Cordobes", 52));
		
		System.out.println(col1.existePersona("Javier","Cordobes"));
		System.out.println(col1.listarDatosPersonas());
		System.out.println(col1.obtenerMasJoven());
	}
	
}