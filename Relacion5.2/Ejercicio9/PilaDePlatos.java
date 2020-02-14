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
		PlatoApilable aux;
		aux = this.tope;
		this.tope = tope.getPlatoAnterior();
		tope.setPlatoAnterior(null);
		return aux;
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
