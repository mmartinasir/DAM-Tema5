package Ejercicio4;

public class Carta {

	// Attributes
	private int numero = 1;
	private Palo paloDeCarta;

	// Builder
	Carta(int numero, Palo palos) {
		this.setNumero(numero);
		this.paloDeCarta = palos;
		
	}

	// Getters and Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if ((numero > 0 && numero < 8) || (numero > 9 && numero < 13)) {
			this.numero = numero;
		}
	}

	public Palo getPaloDeCarta() {
		return paloDeCarta;
	}

	public void setPalos(Palo palos) {
		this.paloDeCarta = palos;
	}

	//ToString
	public String toString() {
		String salida = getNumero()+" de "+getPaloDeCarta();
		salida = salida+"\n";
		return salida;
	}
		

}
