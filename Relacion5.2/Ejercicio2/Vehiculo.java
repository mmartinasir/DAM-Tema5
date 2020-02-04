package Ejercicio2;

public abstract class Vehiculo {
	private static int vehiculosCreados;
	private static int kilometrosTotales;
	private int kilometrosRecorridos;
	
	
	//Builders
	public Vehiculo(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
		incrementaVehiculosCreados();
	}
	
	public Vehiculo() {
		this.kilometrosRecorridos = 0;
		incrementaVehiculosCreados();
	}

	//Getters and Setters
	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public static void setVehiculosCreados(int vehiculosCreados) {
		Vehiculo.vehiculosCreados = vehiculosCreados;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public static void setKilometrosTotales(int kilometrosTotales) {
		Vehiculo.kilometrosTotales = kilometrosTotales;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
	
	//Methods
	private static void incrementaVehiculosCreados() {
		Vehiculo.vehiculosCreados++;
	}
	
	public void andar (int kilometros) {
		this.kilometrosRecorridos += kilometros;
		Vehiculo.kilometrosTotales += kilometros;
	}

}
