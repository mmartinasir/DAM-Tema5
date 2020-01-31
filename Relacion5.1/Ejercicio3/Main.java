package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		String[] nombreEspectador = {"Manuel","Paco","Pepe","Alberto","Antonio","Daniel","Javier","Ivan","Eduardo","Hernesto","Victor","Carlos","Moises","Mario","Juan","Luis",};
		Espectador[] espectador = new Espectador[60];
				
		//Creamos la pelicula
		Pelicula peli = new Pelicula("Amanecer dorado", 18);
		
		//Creamos una sala que reproduzca nuestra pelicula
		Sala sala1 = new Sala(peli, 5, 20, 17.30);
		
		//Asignamos los espectadores
		for (int i = 0; i < 60; i++) { 
			espectador[i] = new Espectador(nombreEspectador[(int)(Math.random()*16)], (int)(Math.random()*22)+14, (double)(Math.random()*40.0)+10.0);
			sala1.reservarAsiento(espectador[i]);
		}
		
		//Mostramos un mapa de la sala que hemos creado
		System.out.println(sala1);

	}

}
