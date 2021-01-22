package practico12;

public class PruebaPersona {
	public static void main(String[] args) {

		Persona persona1 = new Persona("Jordi", "Abdul", 33);
		Persona persona2 = new Persona("Javier", "Cordobes", 32);
		
		persona1.printPersona();
		persona2.printPersona();
		
		persona2.esMasJoven(persona1);

	}
}
