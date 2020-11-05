package operaciones;

public class PruebaAritmetica {
	public static void main(String[] args) {
	/*	Aritmetica aritmetica1 = new Aritmetica();

		aritmetica1.a = 10;
		aritmetica1.b = 20;

		aritmetica1.sumar();

		int resultado = aritmetica1.sumarConRetorno();
		System.out.println("resultado desde retorno: " + resultado);

		resultado = aritmetica1.sumarConArgumentos(5, 10);
		System.out.println("resultado usando argumentos: " + resultado);
*/
		//Variables locales

		
		//nuevo objeto Aritmetica desde contructor vacio
		Aritmetica aritmetica1 = new Aritmetica();
		System.out.println("aritmetica1 a: " + aritmetica1.a);
		System.out.println("aritmetica1 b: " + aritmetica1.b);
		
		//nuevo objeto Aritmetica desde contructor con argumentos
		Aritmetica aritmetica2 = new Aritmetica(5, 10);
		System.out.println("aritmetica2 a: " + aritmetica2.a);
		System.out.println("aritmetica2 b: " + aritmetica2.b);
	}
}
