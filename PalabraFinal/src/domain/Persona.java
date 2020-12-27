package domain;



public  class Persona {
	
	//contaste definida en mayuscula
	public final static int CONTASNTE =1;
	
	private String nombre;
	
	
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	
	public final void Imprimir() {
		System.out.println("imprimir desde clase persona");
	}
}


//si la clase es final entonces empleado no puede heredar desde ella.
/*
public final class Persona {

}
*/