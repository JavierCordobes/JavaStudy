package dominio;

public class Persona {
	private int idPersona;
	private String name;
	private static int contadorPersonas;
	
	public Persona (String name) {
		this.name=name;
		
		// incrementar el contador de personas
		Persona.contadorPersonas++; 
		
		// asignar el contador a idPersonas
		this.idPersona = Persona.contadorPersonas;
	}

	
	
	
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", name=" + name + "]";
	}
	
	
	
}
