package Ejercicio8;

import java.time.LocalDate;

public class PersonalLaboral extends Empleado {
	
	//Attributes
	private String titulacion;

	public PersonalLaboral(String nombre, String direccion, int telefono, String email, int oficina, double salario,
			LocalDate fecha, String titulacion) {
		super(nombre, direccion, telefono, email, oficina, salario, fecha);
		this.titulacion = titulacion;
	}
	
	//Getters and Setters
	public PersonalLaboral(String nombre) {
		super(nombre);
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	//ToString
	@Override
	public String toString() {
		String result = "";
		result = result+"Personal Laboral: "+super.getNombre();
		return result;
	}
	
	
	
	

}
