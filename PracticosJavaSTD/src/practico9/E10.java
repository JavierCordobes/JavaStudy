package practico9;

public class E10 {
	public static void main(String[] args) {
		int contadorVocales = 0;
		for (int i = 0; i < 10; i++) {
			int l = (char) (Math.random() * 26 + 'a');
			System.out.println((char) l);

			if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
				contadorVocales++;
			}else if (l=='z') {
				break;
			}

		}
		System.out.println("contador vocales: "+contadorVocales);
	}

}
