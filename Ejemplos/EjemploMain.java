
public class EjemploMain {

	public static void main(String[] args) {

		Triangulo miT = new Triangulo();
		Triangulo miT2 = new Triangulo(6, 7, 4);

		System.out.println("Lado 1: " + miT.getLado1());
		System.out.println("Lado 2: " + miT.getLado2());
		System.out.println("Lado 3: " + miT.getLado3());

		Triangulo.numLados = 4;
		miT.setLado1(5);
		miT.setLado2(3);
		miT.setLado3(6);

		System.out.println("Perimetro del Triangulo: " + miT.calcularPerimetro());

		System.out.println(miT.toString());

		System.out.println(miT.calcularTipoTriangulo());

		System.out.println();

		// Altavoz

		Altavoz alta1 = new Altavoz();
		Altavoz alta2 = new Altavoz("Sony", 25);

		System.out.println("Marca de altavoz 1: " + alta1.getMarca());
		System.out.println("Marca de altavoz 2: " + alta2.getMarca());
		System.out.println("Volumen de altavoz 1: " + alta1.getVolumen());
		System.out.println("Volumen de altavoz 2: " + alta2.getVolumen());

	}

}
