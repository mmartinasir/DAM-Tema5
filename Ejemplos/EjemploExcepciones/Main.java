package EjemploExcepciones;

public class Main {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		Libro l1 = new Libro();
		
		try {
			l1.divide(a, b);
		} catch (Exception e) {
			System.out.println("Error");
		}
		
	}

}
