package Ejercicio4;

public class Terminal {
	
	//Attributes
	private int numero;
	private int tiempoDeConversacion;
	
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
	
	//Methods
	public void llamaA(Terminal t, int tiempo) {
		this.tiempoDeConversacion += tiempo;
	}

}
