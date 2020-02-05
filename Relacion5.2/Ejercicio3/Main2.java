package Ejercicio3;

public class Main2 {

	public static void main(String[] args) {
		
		Familiar pepe = new Familiar("Pepe", Sexo.HOMBRE);
		Familiar maria = new Familiar("Maria", pepe, null, Sexo.MUJER);
		Familiar oscar = new Familiar("Oscar", null, null, Sexo.HOMBRE);
		Familiar jose = new Familiar("Jose", pepe, null, Sexo.HOMBRE);
		Familiar ana = new Familiar("Ana", null, null, Sexo.MUJER);
		Familiar luis = new Familiar("Luis", oscar, maria, Sexo.HOMBRE);
		Familiar roberto = new Familiar("Roberto", oscar, maria, Sexo.HOMBRE);
		Familiar alba = new Familiar("Alba", jose, ana, Sexo.MUJER);
		Familiar rocio = new Familiar("Rocio", jose, ana, Sexo.MUJER);
		
		System.out.println("¿Es padre?");
		if (oscar.esPadreDe(luis)) {
			System.out.println("Es padre");
		} else {
			System.out.println("No es padre");
		}
		
		System.out.println();
		System.out.println("¿Es hijo?");
		if (luis.esHijoDe(oscar)) {
			System.out.println("Es hijo");
		} else {
			System.out.println("No es hijo");
		}
		
		System.out.println();
		System.out.println("¿Es hermano?");
		if (luis.esHermanoDe(roberto)) {
			System.out.println("Es hermano");
		} else {
			System.out.println("No es hermano");
		}
		
		System.out.println();
		System.out.println("¿Es abuelo?");
		if (pepe.esAbueloDe(luis)) {
			System.out.println("Es abuelo");
		} else {
			System.out.println("No es abuelo");
		}
		
		System.out.println();
		System.out.println("¿Es nieto?");
		if (luis.esNietoDe(pepe)) {
			System.out.println("Es nieto");
		} else {
			System.out.println("No es nieto");
		}
		
		System.out.println();
		System.out.println("¿Es tio?");
		if (oscar.esTioDe(rocio)) {
			System.out.println("Es tio");
		} else {
			System.out.println("No es tio");
		}
		
		System.out.println();
		System.out.println("¿Es sobrino?");
		if (rocio.esSobrinoDe(oscar)) {
			System.out.println("Es sobrino");
		} else {
			System.out.println("No es sobrino");
		}
		

	}

}
