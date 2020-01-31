package Ejercicio5;

public class Main {

	public static void main(String[] args) {
		Fraccion fraccionA = new Fraccion(3,5);
		Fraccion fraccionB = new Fraccion(8,15);
		Fraccion fraccionC;
		fraccionC = fraccionA.restar(fraccionB);
		System.out.println(fraccionC);
	}

}
