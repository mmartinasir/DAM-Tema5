package Relacion6;

public class Publicacion {
	
	//Attributes
	private int isbn;
	private String titulo;
	private int añoPublicacion;

	public Publicacion(String titulo) {
		this.isbn = 0;
		this.titulo = titulo;
	}
	
	public Publicacion(int isbn, String titulo, int añoPublicacion) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}

	//Getters and Setters
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	

}
