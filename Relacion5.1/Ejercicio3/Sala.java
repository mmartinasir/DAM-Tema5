package Ejercicio3;

public class Sala {

	// Attributes
	private Pelicula peliculaEnSala;
	private boolean[][] disposicionAsientos;
	private double precioEntrada;
	
	//Builder
	Sala(Pelicula peliculaenSala, int columnas, int asientos, double precioEntrada){
		this.peliculaEnSala = peliculaenSala;
		this.disposicionAsientos = new boolean[columnas][asientos];
		this.precioEntrada = precioEntrada;
	}
	
	//Getters and Setters
	public Pelicula getPeliculaEnSala() {
		return peliculaEnSala;
	}
	public void setPeliculaEnSala(Pelicula peliculaEnSala) {
		this.peliculaEnSala = peliculaEnSala;
	}
	public boolean[][] getDisposicionAsientos() {
		return disposicionAsientos;
	}
	public void setDisposicionAsientos(boolean[][] disposicionAsientos) {
		this.disposicionAsientos = disposicionAsientos;
	}
	public double getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	
	public void reservarAsiento(Espectador espectador) {
		if (espectador.getEdad() >= this.peliculaEnSala.getEdadMinima() && espectador.getDinero() >= this.precioEntrada) {
			int columna = (int)(Math.random()*5);
			int asiento = (int)(Math.random()*20);
			while (disposicionAsientos[columna][asiento]) {
				columna = (int)(Math.random()*5);
				asiento = (int)(Math.random()*20);
			}
			disposicionAsientos[columna][asiento] = true;
		}
		
	}

	//ToString
	public String toString() {
		String salida = "";
		int numeroEspectadores = 0;
		salida += "                       ";
		salida += peliculaEnSala.getTitulo();
		salida += "\n";
		salida += "--------------------------------------------------------------";
		salida += "\n";
		for (int i = 0; i < disposicionAsientos.length; i++) {
			for (int j = 0; j < disposicionAsientos[i].length; j++) {
				if (j == 10) {
					salida += "  ";
				}
				if (disposicionAsientos[i][j]) {
					salida += "[O]";
					numeroEspectadores++;
				} else {
					salida += "[ ]";
				}	
			}
			salida += "\n";
		}
		salida += "\n";
		salida += "Numero de espectadores: "+numeroEspectadores;
		return salida;
	}	
		
}
