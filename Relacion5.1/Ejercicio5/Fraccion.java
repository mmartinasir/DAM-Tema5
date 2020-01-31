package Ejercicio5;

public class Fraccion {
	// Attributes
	private int dividendo;
	private int divisor;

	// Builders
	public Fraccion(int dividendo, int divisor) {
		this.dividendo = dividendo;
		setDivisor(divisor);
	}

	// Getters and Setters
	public int getDividendo() {
		return dividendo;
	}

	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		if (divisor != 0)
			this.divisor = divisor;
	}

	// ToString
	public String toString() {
		String result = "";
		result = result + dividendo;
		result = result + "\n";
		result = result + "---";
		result = result + "\n";
		result = result + divisor;
		return result;
	}

	// Methods
	public Fraccion sumar(Fraccion a) {
		int dividendo = (this.dividendo * a.divisor) + (a.dividendo * divisor);
		int divisor = (this.divisor * a.divisor);
		Fraccion result = new Fraccion(dividendo, divisor);
		result.reducir();
		return result;
	}

	public Fraccion restar(Fraccion a) {
		int dividendo;
		int divisor;
		if (this.divisor == a.divisor) {
			dividendo = this.dividendo * a.dividendo;
			divisor = this.divisor;
		} else {
			dividendo = (this.dividendo * a.divisor) - (this.divisor * a.dividendo);
			divisor = this.divisor * a.divisor;
		}
		Fraccion result = new Fraccion(dividendo, divisor);
		result.reducir();
		return result;
	}

	public Fraccion multiplicar(Fraccion a) {
		int dividendo = this.dividendo * a.dividendo;
		int divisor = this.divisor * a.divisor;
		Fraccion result = new Fraccion(dividendo, divisor);
		result.reducir();
		return result;
	}

	public Fraccion dividir(Fraccion a) {
		int dividendo = this.dividendo * a.divisor;
		int divisor = this.divisor * a.dividendo;
		Fraccion result = new Fraccion(dividendo, divisor);
		result.reducir();
		return result;
	}

	public void reducir() {
		int div = mcd(dividendo, divisor);
		this.dividendo = this.dividendo / div;
		this.divisor = this.divisor / div;
	}
	
	private int mcd (int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return mcd (b, a%b);
		}
	}
}
