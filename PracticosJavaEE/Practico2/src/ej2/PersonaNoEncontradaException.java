package ej2;

public class PersonaNoEncontradaException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String mensaje;
	
	public PersonaNoEncontradaException (String mensaje) {
		this.mensaje=mensaje;
	}
	public String getMensaje() {
		return this.mensaje;
	}
	
	
	
}
