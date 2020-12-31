package colecciones;

import java.util.Vector;

public class VectorPersonas {
	private Vector<Persona> personas;
	public VectorPersonas()
	{
		personas = new Vector<Persona>();		
	}
    public void insertar(Persona p)
    {
    	personas.add(p);
    	
    }
    public void listar()
    {
    	for(int i = 0; i< personas.size(); i++)
    	{
    		System.out.println(((Persona)personas.get(i)).getNombre());
    	}
    }
    public void remover(int posicion)
    {
    	personas.remove(posicion);
    }
    public void listar2()
    {
    	for(Persona p : personas)
    		System.out.println(p.getNombre());
    }
}
