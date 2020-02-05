package Ejercicio5;

public class Terminal {
	
	//Attributes
	private int numero;
	protected int tiempoDeConversacion;
	
	//Builders
	public Terminal(int numero) {
		this.numero = numero;
		this.tiempoDeConversacion = 0;
	}
	
	//Getters and Setters
	public int getNumero() {
		return numero;
	}

	public int getTiempoDeConversacion() {
		return tiempoDeConversacion;
	}
	
	public void setTiempoDeConversacion(int tiempoDeConversacion) {
		this.tiempoDeConversacion = tiempoDeConversacion;
	}

	//Methods
	public void llamaA(Terminal t, int tiempo) {
		this.tiempoDeConversacion += tiempo;
	}

}
