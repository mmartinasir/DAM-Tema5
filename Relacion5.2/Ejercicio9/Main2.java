package Ejercicio9;

public class Main2 {

	public Main2() {
		PilaDePlatos pila = new PilaDePlatos(null);
		PlatoApilable plato1 = new PlatoApilable(Tipo.HONDO, "blanco");
		PlatoApilable plato2 = new PlatoApilable(Tipo.LLANO, "azul");
		PlatoApilable plato3 = new PlatoApilable(Tipo.HONDO, "blanco");
		PlatoApilable plato4 = new PlatoApilable(Tipo.POSTRE, "negro");
		PlatoApilable plato5 = new PlatoApilable(Tipo.HONDO, "blanco");
		PlatoApilable plato6 = new PlatoApilable(Tipo.LLANO, "violeta");
		PlatoApilable plato7 = new PlatoApilable(Tipo.HONDO, "blanco");
		PlatoApilable plato8 = new PlatoApilable(Tipo.POSTRE, "gris");
		
		pila.push(plato1);
		pila.push(plato2);
		pila.push(plato3);
		pila.push(plato4);
		pila.push(plato5);
		pila.push(plato6);
		pila.push(plato7);
		pila.push(plato8);
		
		System.out.println(pila.peek());
		
	}

}
