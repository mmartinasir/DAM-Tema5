package Ejercicio5;

public class Movil extends Terminal {

	// Attributes
	private Tarifa tarifa;

	// Builders
	public Movil(int numero) {
		super(numero);
	}

	// Getters and Setters
	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	// Methods
	@Override
	public void llamaA(Terminal t, int tiempo) {
		this.tiempoDeConversacion += tiempo;
		factura(tiempo);
	}

	private double factura(int tiempo) {
		switch (this.tarifa) {
		case BIS:
			return (tiempo / 60) * 10;
		case PLUS:
			return (tiempo / 60) * 8;
		case TOTAL:
			return (tiempo / 60) * 5;
		}
		return 0.0;
	}

}
