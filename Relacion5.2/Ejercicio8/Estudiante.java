package Ejercicio8;

public class Estudiante extends Persona {
	
	//Attributes
	private NivelEstudio nivelEstudio;
	
	//Builders
	public Estudiante(String nombre, String direccion, int telefono, String email) {
		super(nombre, direccion, telefono, email);
	}
	
	public Estudiante(String nombre, String direccion, int telefono, String email, NivelEstudio nivel) {
		super(nombre, direccion, telefono, email);
		this.nivelEstudio = nivel;
	}
	
	public Estudiante(String nombre) {
		super(nombre);
	}

	//Getters and Setters
	public NivelEstudio getNivelEstudio() {
		return nivelEstudio;
	}

	public void setNivelEstudio(NivelEstudio nivelEstudio) {
		this.nivelEstudio = nivelEstudio;
	}

	//ToString
	@Override
	public String toString() {
		String result = "";
		result = result+"Estudiante: "+super.getNombre();
		return result;
	}	

}
