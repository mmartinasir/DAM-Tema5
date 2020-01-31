
public class Triangulo {
	public static int numLados = 3;
	private int lado1;
	private int lado2;
	private int lado3;

	// Builders

	Triangulo() {
		lado1 = 1;
		lado2 = 1;
		lado3 = 1;
	}

	Triangulo(int a, int b, int c) {
		lado1 = a;
		lado2 = b;
		lado3 = c;
	}

	// Getters and Setters

	public static int getNumLados() {
		return numLados;
	}

	public static void setNumLados(int numLados) {
		Triangulo.numLados = numLados;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		if (lado1 > 0)
			this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		if (lado2 > 0)
			this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		if (lado3 > 0)
			this.lado3 = lado3;
	}

	// Métodos del Triangulo

	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}

	public int calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}

	public String calcularTipoTriangulo() {
		// Equilatero
		if (lado1 == lado2 && lado2 == lado3)
			return "El triangulo es equilátero";
		// Isósceles
		if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2)
			return "El triangulo es isósceles";
		// Escaleno
		if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1)
			return "El triángulo es escaleno";
		return "Error en el cálculo del tipo de triángulo";
	}

}
