package Ejercicio9;

public class PilaDePlatos {

	// Attributes
	private PlatoApilable tope;

	// Builders
	public PilaDePlatos() {
		this.tope = null;
	}

	// Methods
	public PlatoApilable pop() {
		this.tope = tope.getPlatoAnterior();
		return this.tope;
	}

	public PlatoApilable peek() {
		return this.tope;
	}

	public void push(PlatoApilable p) {
		if (this.tope == null) {
			this.tope = p;
		} else {
			p.setPlatoAnterior(this.tope);
			this.tope = p;
		}
	}
}
