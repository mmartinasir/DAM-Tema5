package Ejercicio8;

import java.time.LocalDate;

public class Empleado extends Persona {
	
	//Attributes
	private int oficina;
	private double salario;
	private LocalDate fechaContratacion;

	//Builders
	public Empleado(String nombre, String direccion, int telefono, String email, int oficina, double salario, LocalDate fecha) {
		super(nombre, direccion, telefono, email);
		this.oficina = oficina;
		this.salario = salario;
		this.fechaContratacion = fecha;
	}
	
	public Empleado(String nombre) {
		super(nombre);
	}
	
	//Getters and Setters
	public int getOficina() {
		return oficina;
	}

	public void setOficina(int oficina) {
		this.oficina = oficina;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(LocalDate fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	//ToString
	@Override
	public String toString() {
		String result = "";
		result = result+"Empleado: "+super.getNombre();
		return result;
	}
	
	
	
	

}
