package Ejercicio9;

public class PilaDePlatos {
	
	//Attributes
	private PlatoApilable tope;
	
	//Builders
	public PilaDePlatos(PlatoApilable tope) {
		this.tope = tope;
	}
	
	//Methods
	public void pop() {
		
	}
	
	public PlatoApilable peek() {
		return this.tope;
	}
	
	public void push(PlatoApilable p) {
		if (this.tope == null) {
			this.tope = p;
		} else {
			p.setPlatoAnterior(this.tope);
		}
	}
	
}
