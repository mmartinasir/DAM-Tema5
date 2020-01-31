package Ejercicio6;

public class Libro {
	
	//Attributes
	private String titulo;
	private String autor;
	private int isbm;
	private int numPaginas;
	private double calificacion;
	
	//Builders
	public Libro(String titulo, String autor, int isbm, int numPaginas, double calificacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbm = isbm;
		setNumPaginas(numPaginas);
		setCalificacion(calificacion);
	}
	
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbm() {
		return isbm;
	}

	public void setIsbm(int isbm) {
		this.isbm = isbm;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		if(numPaginas > 0)
		this.numPaginas = numPaginas;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		if (calificacion > 0 && calificacion <= 10)
		this.calificacion = calificacion;
	}

	//ToString
	public String toString() {
		String result = "";
		result = result + "Título: "+this.titulo+"\n";
		result = result + "Autor: "+this.autor+"\n";
		result = result + "ISBM: "+this.isbm+"\n";
		result = result + "Páginas: "+this.numPaginas+"\n";
		result = result + "Calificación: "+this.calificacion+"\n";
		return result;
	}
	
	//Methods
	public boolean equals(Object a) {
		if (this == a) {
			return true;
		} else {
			if (this.autor.equals(((Libro) a).getAutor()) && this.titulo.equals(((Libro) a).getTitulo())) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	

}
