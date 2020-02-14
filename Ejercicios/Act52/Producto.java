package Act52;
/**
 * @author Manuel Martin Gimeno
 */
public class Producto {
	
	//Attributes
	private String descripcion;
	private int cantidad;
	private double precioUnitario;

	//Builders
	public Producto(String descripcion, int cantidad, double precioUnitario) {
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	//Getters and Setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	

}
