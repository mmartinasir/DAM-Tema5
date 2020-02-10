package Ejercicio9;

public class Plato {
	
	//Attributes
	private Tipo tipo;
	private String color;
	
	
	//Builders
	public Plato(Tipo tipo, String color) {
		this.tipo = tipo;
		this.color = color;
	}

	//Getters and Setters
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//ToString
	@Override
	public String toString() {
		String result = "";
		result = result+"Tipo: "+tipo+"/n"+"Color: "+color;
		return result;
	}
	
	
	
	

}
