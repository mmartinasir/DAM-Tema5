
public class Altavoz {

	private String marca;
	private int volumen;

	// Builders

	Altavoz() {
		marca = "Desconocida";
		volumen = 50;
	}

	Altavoz(String a, int b) {
		marca = a;
		volumen = b;
	}

	// Getters and Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public String toString() {
		String salida;
		salida = "Volumen: " + this.volumen + " Marca: " + this.marca;
		return salida;
	}

}
