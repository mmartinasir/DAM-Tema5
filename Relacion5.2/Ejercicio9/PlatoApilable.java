package Ejercicio9;

public class PlatoApilable extends Plato {
	
	//Attributes
	private PlatoApilable platoAnterior;

	public PlatoApilable(Tipo tipo, String color) {
		super(tipo, color);
	}

	//Getters and Setters
	public PlatoApilable getPlatoAnterior() {
		return platoAnterior;
	}

	public void setPlatoAnterior(PlatoApilable platoAnterior) {
		this.platoAnterior = platoAnterior;
	}

	//ToString
	@Override
	public String toString() {
		String result = "";
		result = result+"Plato tipo "+super.getTipo()+" de color "+super.getColor();
		return result;
	}	
	
	

}
