package Ejercicio2;

public class Coche extends Vehiculo {
	
	//Attributes
	private String marca;

	//Builders
	public Coche(int kilometrosRecorridos, String marca) {
		super(kilometrosRecorridos);
		this.marca = marca;
	}
	
	public Coche() {
		super();
		this.marca = "Desconocida";
	}
	
	//Getters and Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//Methods
	@Override
	public void truco() {
		this.quemaRuedas();
	}
	
	public void quemaRuedas() {
		System.out.println("Quemando rueda");
	}

}
