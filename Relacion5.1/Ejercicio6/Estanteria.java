package Ejercicio6;

public class Estanteria {
	// Attributes
	private Libro[] libros;

	// Getters and Setters

	// Builders
	public Estanteria(int a) {
		libros = new Libro[a];
	}

	// ToString
	public String toString() {
		String result = "";
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null)
				result = result + libros[i] + "\n";
		}
		return result;

	}

	// Methods
	public void añadirLibro(Libro a) {
		int contador = 0;
		while (libros[contador] != null && contador <= libros.length) {
			contador++;
		}
		if (contador <= libros.length) {
			libros[contador] = a;
		}
	}

	public void eliminarLibro(Libro a) {
		int contador = 0;
		while (libros[contador].getTitulo() != a.getTitulo() && contador <= libros.length) {
			contador++;
		}
		if (contador <= libros.length) {
			libros[contador] = null;
			if (contador != libros.length) {
				for (int i = contador + 1; i < libros.length; i++) {
					if (libros[i] == null)
						libros[i - 1] = libros[i];
				}
			}

		}
	}

	public Libro buscarLibro(String a) {
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getTitulo() == a)
				return libros[i];
		}
		return null;
	}

	public void ordenarCalificacion() {
		Libro porOrdenar = libros[0];

		for (int i = 0; i < libros.length; i++) {
			porOrdenar = libros[i];
			for (int j = i; j < libros.length; j++) {
				if (libros[j].getCalificacion() > libros[i].getCalificacion()) {
					libros[i] = libros[j];
					libros[j] = porOrdenar;
				}
			}
		}

	}

}
