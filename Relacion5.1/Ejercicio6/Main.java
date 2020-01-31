package Ejercicio6;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Amanecer dorado","Arturo Vals");
		libro1.setCalificacion(4.5);
		Libro libro2 = new Libro("Amanecer dorado 2","Arturo Vals");
		libro2.setCalificacion(7.0);
		Libro libro3 = new Libro("Amanecer dorado 3","Arturo Vals");
		libro3.setCalificacion(10.0);
		Estanteria estante1 = new Estanteria(3);
		
		estante1.añadirLibro(libro1);
		estante1.añadirLibro(libro2);
		estante1.añadirLibro(libro3);
		System.out.println(estante1);
		
		System.out.println("Probamos ordenar por calificacion");
		System.out.println();
		estante1.ordenarCalificacion();
		System.out.println(estante1);

	}

}
