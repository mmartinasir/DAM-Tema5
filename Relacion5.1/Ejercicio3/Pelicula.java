package Ejercicio3;

public class Pelicula {

	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;

	// Builder	
	Pelicula(String titulo, int edadMinima) {
		this.titulo = titulo;
		if (edadMinima < 0) {
			this.edadMinima = edadMinima * (-1);
		} else {
			this.edadMinima = edadMinima;
		}
	}

	Pelicula(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		if (edadMinima < 0) {
			this.edadMinima = edadMinima * (-1);
		} else {
			this.edadMinima = edadMinima;
		}
		this.director = director;
	}

	// Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
