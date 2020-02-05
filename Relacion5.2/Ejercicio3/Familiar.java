package Ejercicio3;

import java.util.Date;

public class Familiar {
	
	//Attributes
	private String nombre;
	private Familiar padre;
	private Familiar madre;
	private Sexo sexo;
	private Date fechaNacimiento;
	
	//Builders
	public Familiar(String nombre, Sexo sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	public Familiar(String nombre, Familiar padre, Familiar madre, Sexo sexo) {
		this.nombre = nombre;
		this.padre = padre;
		this.madre = madre;
		this.sexo = sexo;
	}
	
	public Familiar(String nombre, Familiar padre, Familiar madre, Sexo sexo, Date fechaNacimiento) {
		this.nombre = nombre;
		this.padre = padre;
		this.madre = madre;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Familiar getPadre() {
		return padre;
	}

	public void setPadre(Familiar padre) {
		this.padre = padre;
	}

	public Familiar getMadre() {
		return madre;
	}

	public void setMadre(Familiar madre) {
		this.madre = madre;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Methods
	public boolean esPadreDe(Familiar f) {
		if (this.getNombre().equals(f.padre.getNombre())) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esHijoDe(Familiar f) {
		if (f.sexo == Sexo.HOMBRE) {
			if (this.padre.getNombre().equals(f.nombre)) {
				return true;
			} else {
				return false;
			}
		} else {
			if (this.madre.getNombre().equals(f.nombre)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean esHermanoDe(Familiar f) {
		if (this.padre.getNombre().equals(f.padre.getNombre())){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esAbueloDe(Familiar f) {
		 if (this.getSexo() == Sexo.HOMBRE) {
			if (this.getNombre().equals(f.padre.padre.getNombre())) {
				return true;
			} else {
				return false;
			}
		} else {
			if (this.getNombre().equals(f.madre.madre.getNombre())) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean esNietoDe(Familiar f) {
		if (f.getSexo() == Sexo.HOMBRE) {
			if (this.padre.padre.getNombre().equals(f.getNombre())) {
				return true;
			} else {
				return false;
			}
		} else {
			if (this.madre.madre.getNombre().equals(f.getNombre())) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean esTioDe(Familiar f) {
		if (this.getSexo() == Sexo.HOMBRE) {
			if (this.padre.getNombre().equals(f.padre.padre.getNombre())) {
				return true;
			} else {
				return false;
			}
		} else {
			if (this.madre.getNombre().equals(f.madre.madre.getNombre())) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean esSobrinoDe(Familiar f) {
		if (f.getSexo() == Sexo.HOMBRE) {
			if (this.padre.padre.getNombre().equals(f.padre.getNombre())) {
				return true;
			} else {
				return false;
			}
		} else {
			if (this.madre.madre.getNombre().equals(f.madre.getNombre())) {
				return true;
			} else {
				return false;
			}
		}
	}
}
