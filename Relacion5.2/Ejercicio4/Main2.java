package Ejercicio4;

public class Main2 {

	public static void main(String[] args) {
		Terminal terminalA = new Terminal(655);
		Terminal terminalB = new Terminal(677);
		
		terminalA.llamaA(terminalB, 140);
		
		System.out.println(terminalA.getTiempoDeConversacion());

	}

}
