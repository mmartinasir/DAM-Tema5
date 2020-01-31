package Ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nombre = "";
		int edad = 0;
		Sexo sexo;
		double peso = 0.0;
		double altura = 0.0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre");
		nombre = input.nextLine();
		System.out.println("Introduzca su edad");
		edad = input.nextInt();
		System.out.println("Introduzca su sexo");
		sexo = convertidorSexo(input.next().charAt(0));
		System.out.println("Introduzca su peso");
		peso = input.nextDouble();
		System.out.println("Introduzca su altura");
		altura = input.nextDouble();
		
		//Primer objeto
		Persona objeto1 = new Persona(nombre, edad, sexo, peso, altura);
		//Segundo objeto
		Persona objeto2 = new Persona(nombre, edad, sexo);
		//Tercer objeto
		Persona objeto3 = new Persona();
		objeto3.setNombre("Alfredo");
		objeto3.setEdad(24);
		objeto3.setSexo(Sexo.H);
		objeto3.setPeso(96.40);
		objeto3.setAltura(1.60);
		
		//Peso Ideal
		System.out.println();
		if (objeto1.calcularIMC() == 0) {
			System.out.println("El primer perfil esta en su peso ideal");
		} else {
			System.out.println("El primer perfil no esta en su peso ideal");
		}
		if (objeto2.calcularIMC() == 0) {
			System.out.println("El segundo perfil esta en su peso ideal");
		} else {
			System.out.println("El segundo perfil no esta en su peso ideal");
		}
		if (objeto2.calcularIMC() == 0) {
			System.out.println("El tercer perfil esta en su peso ideal");
		} else {
			System.out.println("El tercer perfil no esta en su peso ideal");
		}
		
		System.out.println();
		//Comprobación de mayoría de edad
		if (objeto1.esMayorDeEdad()) {
			System.out.println("El primer perfil es mayor de edad");
		} else {
			System.out.println("El primer perfil no es mayor de edad");
		}
		if (objeto2.esMayorDeEdad()) {
			System.out.println("El segundo perfil es mayor de edad");
		} else {
			System.out.println("El segundo perfil no es mayor de edad");
		}
		if (objeto3.esMayorDeEdad()) {
			System.out.println("El tercer perfil es mayor de edad");
		} else {
			System.out.println("El tercer perfil no es mayor de edad");
		}
		
		//Mostrar informaci�n de los objetos
		System.out.println();
		System.out.println(objeto1.toString());
		System.out.println(objeto2.toString());
		System.out.println(objeto3.toString());
		
	}
	
	public static Sexo convertidorSexo(char a) {
		if (a == 'M') {
			return Sexo.M;
		} else {
			return Sexo.H;
		}
	};

}



