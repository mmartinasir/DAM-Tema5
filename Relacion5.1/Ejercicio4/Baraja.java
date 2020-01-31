package Ejercicio4;

public class Baraja {
	
	//Attributes
	private Carta[] barajaEspañola = new Carta[40];
	
	//Builders
	Baraja() {
		int contNum = 1;
		
		//Cartas de palo Espadas
		for (int i = 0; i < 10; i++) {
			if (contNum == 8) {
				contNum = contNum+2;
			}
			barajaEspañola[i] = new Carta(contNum, Palo.ESPADAS);
			contNum++;
		}
		contNum = 1;
		//Cartas de palo Bastos
		for (int i = 10; i < 20; i++) {
			if (contNum == 8) {
				contNum = contNum+2;
			}
			barajaEspañola[i] = new Carta(contNum, Palo.BASTOS);
			contNum++;
		}
		contNum = 1;
		//Cartas de palo Oros
		for (int i = 20; i < 30; i++) {
			if (contNum == 8) {
				contNum = contNum+2;
			}
			barajaEspañola[i] = new Carta(contNum, Palo.OROS);
			contNum++;
		}
		contNum = 1;
		//Cartas de palo Copas
		for (int i = 30; i < 40; i++) {
			if (contNum == 8) {
				contNum = contNum+2;
			}
			barajaEspañola[i] = new Carta(contNum, Palo.COPAS);
			contNum++;
		}
	}

	//ToString
	public String toString() {
		String salida = "";
		for (int i = 0; i < barajaEspañola.length; i++) {
			salida = salida+barajaEspañola[i];
		}
		return salida;
		
	}
	
	//Metodos
	public void Barajar() {
		int primeraCarta;
		int segundaCarta;
		
		for (int i = 0; i < (barajaEspañola.length/2); i++) {
			primeraCarta = (int)(Math.random()*barajaEspañola.length);
			segundaCarta = (int)(Math.random()*barajaEspañola.length);
		}
	}
		
}
