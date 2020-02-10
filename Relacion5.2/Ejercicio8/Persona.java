package Ejercicio8;

public class Persona {
	
	//Attributes
	private String nombre;
	private String direccion;
	private int telefono;
	private String email;
	
	//Builders
	public Persona(String nombre, String direccion, int telefono, String email) {
		this.nombre	= nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//ToString
	@Override
	public String toString() {
		String result = "";
		result = result+"Persona: "+nombre;
		return result;
	}

	
	
	

}
