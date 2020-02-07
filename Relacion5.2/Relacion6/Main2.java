package Relacion6;

public class Main2 {

	public static void main(String[] args) {
		Libro libro1 = new Libro(1456789, "Amanecer Dorado", 1987);
		Libro libro2 = new Libro(1456790, "Amanecer Dorado 2", 1990);
		Libro libro3 = new Libro(1456791, "Amanecer Dorado 3", 1994);
		
		System.out.println(libro1.estaPrestado());
		System.out.println("Vamos a prestar el primer libro");
		libro1.presta();
		System.out.println(libro1.estaPrestado());

	}

}
