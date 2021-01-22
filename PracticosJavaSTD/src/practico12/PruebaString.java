package practico12;

public class PruebaString {

	public static void main(String[] args) {
		String s = "abc";
		String t = "";
		String v = "";
		do {
			if (s.length() > t.length())
				t = t + "x";
			else {
				v = s;
				s = s + t;
				t = v + t;
			}
			System.out.println(" s = " + s);
			System.out.println(" t = " + t);
		} while (s.compareTo(t) != 0);
	}
}

/*
 * 
 * s= "abcxxx"
 * t= "abcxxx" 
 * v= "abc"
 * 
 * 
 * s = abc 
 * t = x 
 * s = abc 
 * t = xx 
 * s = abc 
 * t = xxx 
 * s= abcxxx 
 * t= xxxabcxxx
 * 
 * 
 * 
 */