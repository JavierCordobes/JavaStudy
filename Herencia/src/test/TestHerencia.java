package test;

import java.util.Date;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;

public class TestHerencia {
	public static void main(String[] args) {
		
		  Empleado empleado1 = new Empleado("Javi",60000.0);
		  System.out.println(empleado1);
		 
		Cliente cliente1 = new Cliente(true,"Javier",'F',33,"JuanPa229");
		System.out.println(cliente1);
	}
}
