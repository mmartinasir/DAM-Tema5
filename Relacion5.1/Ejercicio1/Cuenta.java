package Ejercicio1;

public class Cuenta {

	private String titular;
	private double cantidad;

	// Builders

	Cuenta(String titular) {
		this.titular = titular;
		cantidad = 0.0;
	}

	Cuenta(String titular, double cantidad) {
		this.titular = titular;
		if (cantidad > 0) {
			this.cantidad = cantidad;
		} else {
			this.cantidad = 0.0;
		}
	}

	// Getters and Setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	// ToString
	public String toString() {
		return "Titular de la cuenta: " + titular + " | Cantidad de la cuenta: " + cantidad;
	}

	// Methods
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad = this.cantidad + cantidad;
		}
	}

	public void retirar(double cantidad) {
		if (cantidad > 0) {
			if (this.cantidad - cantidad <= 0) {
				this.cantidad = 0;
			} else {
				this.cantidad = this.cantidad - cantidad;
			}
		}
	}

}
