package Relacion7;

public class Incidencia {
	
	//Attributes
	private int codigo;
	private int puesto;
	private String descripcionIncidencia;
	private boolean resuelto;
	private String descripcionSolucion;
	private static int pendientes;
	private static int numeroIncidencias;
	
	//Builders
	public Incidencia(int puesto, String descripcion) {
		aumentarNumeroIncidencias();
		this.codigo = numeroIncidencias;
		this.puesto = puesto;
		this.descripcionIncidencia = descripcion;
		this.resuelto = false;
		aumentarPendiente();
	}
	
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}

	public int getPuesto() {
		return puesto;
	}

	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}

	public String getDescripcionIncidencia() {
		return descripcionIncidencia;
	}

	public void setDescripcionIncidencia(String descripcionIncidencia) {
		this.descripcionIncidencia = descripcionIncidencia;
	}

	public boolean isResuelto() {
		return resuelto;
	}

	public void setResuelto(boolean resuelto) {
		this.resuelto = resuelto;
	}

	public String getDescripcionSolucion() {
		return descripcionSolucion;
	}

	public void setDescripcionSolucion(String descripcionSolucion) {
		this.descripcionSolucion = descripcionSolucion;
	}
	
	public static int getPendientes() {
		return pendientes;
	}
	
	//ToString
	@Override
	public String toString() {
		String result = "";
		result = result+"Incidencia "+getCodigo()+" - "+getPuesto()+" - "+getDescripcionIncidencia();
		if (!resuelto) {
			result = result+" - "+"Pendiente";
		} else {
			result = result+" - "+"Resuelta"+" - "+getDescripcionSolucion();
		}
		
		return result;
	}
	
	//Methods
	public void resuelve(String solucion) {
		this.resuelto = true;
		this.descripcionSolucion = solucion;
		disminuirPendiente();
	}
	
	private static void aumentarPendiente() {
		Incidencia.pendientes++;
	}
	
	private static void disminuirPendiente() {
		Incidencia.pendientes--;
	}
	
	private static void aumentarNumeroIncidencias() {
		Incidencia.numeroIncidencias++;
	}

	
}
