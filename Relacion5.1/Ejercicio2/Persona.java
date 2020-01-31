package Ejercicio2;

public class Persona {

	//Attributes
	private String nombre;
	private int edad;
	private String DNI;
	private Sexo sexo;
	private double peso;
	private double altura;
	
	//Constants
	public static int INFRAPESO = -1;
	public static int NORMOPESO = 0;
	public static int SOBREPESO = 1;


	// Builders
	Persona() {
		sexo = Sexo.H;
		DNI = generaDNI();
	}

	Persona(String nombre, int edad, Sexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = generaDNI();
		this.sexo = sexo;
	}

	Persona(String nombre, int edad, Sexo sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = generaDNI();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// ToString
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	// Methods	
	public int calcularIMC() {
		if (this.peso / (Math.pow(this.altura, 2)) < 20.0) {
			return INFRAPESO;
		} else {
			if (this.peso / (Math.pow(this.altura, 2)) > 25.0) {
				return SOBREPESO;
			} else {
				return NORMOPESO;
			} 
		}
	}
	
	public boolean esMayorDeEdad() {
		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	private Sexo comprobarSexo(Sexo sexo) {
		if (sexo != Sexo.H && sexo != Sexo.M) {
			return Sexo.H;
		} else {
			return sexo;
		}
	}
	
	private String generaDNI() {
		int num = 0;
		char letra = 'A';
		num = (int)(Math.random()*99999999);
		letra = letraDNI(num%23);
		return String.valueOf(num)+letra;
	}
	
	private char letraDNI(int num) {
		char letra = 'A';
		switch (num) {
		case 0:
			letra = 'T';
			break;
		case 1:
			letra = 'R';
			break;
		case 2:
			letra = 'W';
			break;
		case 3:
			letra = 'A';
			break;
		case 4:
			letra = 'G';
			break;
		case 5:
			letra = 'M';
			break;
		case 6:
			letra = 'Y';
			break;
		case 7:
			letra = 'F';
			break;
		case 8:
			letra = 'P';
			break;
		case 9:
			letra = 'D';
			break;
		case 10:
			letra = 'X';
			break;
		case 11:
			letra = 'B';
			break;
		case 12:
			letra = 'N';
			break;
		case 13:
			letra = 'J';
			break;
		case 14:
			letra = 'Z';
			break;
		case 15:
			letra = 'Q';
			break;
		case 16:
			letra = 'V';
			break;
		case 17:
			letra = 'V';
			break;
		case 18:
			letra = 'H';
			break;
		case 19:
			letra = 'L';
			break;
		case 20:
			letra = 'C';
			break;
		case 21:
			letra = 'K';
			break;
		case 22:
			letra = 'E';
			break;
		}
		return letra;
	}

}
