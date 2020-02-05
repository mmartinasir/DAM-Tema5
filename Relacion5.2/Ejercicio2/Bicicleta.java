package Ejercicio2;

public class Bicicleta extends Vehiculo {
	private int marchas;

	// Builders
	public Bicicleta(int kilometrosRecorridos, int marchas) {
		super(kilometrosRecorridos);
		this.marchas = marchas;
	}

	public Bicicleta() {
		super();
		this.marchas = 1;
	}

	// Getters and Setters
	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}

	// Methods
	@Override
	public void truco() {
		this.hacerCaballito();

	}
	
	public void hacerCaballito() {
		System.out.println("Haciendo caballito");
	}
}
