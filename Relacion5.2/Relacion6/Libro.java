package Relacion6;

public class Libro extends Publicacion implements Prestable {
	
	//Attributes
	private boolean prestado;
	
	//Builders
	public Libro(String titulo) {
		super(titulo);
		this.prestado = false;
		
	}

	public Libro(int isbn, String titulo, int añoPublicacion) {
		super(isbn, titulo, añoPublicacion);
		this.prestado = false;
	}
	
	//Getters and Setters
	private void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	//Methods
	@Override
	public void presta() {
		setPrestado(true);
	}

	@Override
	public void devuelve() {
		setPrestado(false);
	}

	@Override
	public boolean estaPrestado() {
		return prestado;
	}

}
