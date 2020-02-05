package Ejercicio2;

public class Main2 {

	public static void main(String[] args) {
		
		Coche miFord = new Coche(0, "ford");
		Coche miFiesta = new Coche(0, "fiesta");
		Coche unRenault = new Coche();
		
		miFord.andar(300);
		miFiesta.andar(100);
		miFord.truco();
		miFord.quemaRuedas();
		
		System.out.println(Vehiculo.getKilometrosTotales());
		System.out.println(Vehiculo.getVehiculosCreados());

	}

}
