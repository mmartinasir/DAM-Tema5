package Ejercicio8;

import java.time.LocalDate;
import java.util.Arrays;

public class Profesor extends Empleado {
	
	//Attributes
	private String[][] horarioLaboral;
	private String categoria;

	//Builders
	public Profesor(String nombre, String direccion, int telefono, String email, int oficina, double salario,
			LocalDate fecha, String categoria) {
		super(nombre, direccion, telefono, email, oficina, salario, fecha);
		this.categoria = categoria;
		
	}
	
	public Profesor(String nombre, String direccion, int telefono, String email, int oficina, double salario,
			LocalDate fecha, String categoria, String[][] horario) {
		super(nombre, direccion, telefono, email, oficina, salario, fecha);
		this.categoria = categoria;
		this.horarioLaboral = horario;
	}
	
	public Profesor(String nombre) {
		super(nombre);
	}

	//Getters and Setters
	public String[][] getHorarioLaboral() {
		return horarioLaboral;
	}

	public void setHorarioLaboral(String[][] horarioLaboral) {
		this.horarioLaboral = horarioLaboral;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	//ToString
	@Override
	public String toString() {
		String result = "";
		result = result+"Profesor: "+super.getNombre();
		return result;
	}
	
	
	
	

}
