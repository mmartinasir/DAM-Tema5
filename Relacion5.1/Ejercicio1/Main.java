package Ejercicio1;

public class Main {

	public static void main(String[] args) {

		Cuenta miCuenta = new Cuenta("Manuel", 50.0);
		Cuenta miCuenta2 = new Cuenta("Alberto");
		
		System.out.println(miCuenta.toString());
		System.out.println(miCuenta2.toString());
		
		System.out.println();

		miCuenta2.ingresar(50.0);
		miCuenta.retirar(40);
		
		System.out.println(miCuenta.toString());
		System.out.println(miCuenta2.toString());
		
		System.out.println();
		
		
		
	}

}
