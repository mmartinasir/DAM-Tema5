package Act52;
/**
 * @author Manuel Martin Gimeno
 */
public class ProductoListable extends Producto {
	
	//Attributes
	private ProductoListable productoSiguiente;
	
	//Builders
	public ProductoListable(String descripcion, int cantidad, double precioUnitario) {
		super(descripcion, cantidad, precioUnitario);
	}

	//Getters and Setters
	public ProductoListable getProductoSiguiente() {
		return productoSiguiente;
	}

	public void setProductoSiguiente(ProductoListable productoAnterior) {
		this.productoSiguiente = productoAnterior;
	}
	
	//Methods

}
