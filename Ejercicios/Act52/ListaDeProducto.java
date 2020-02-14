package Act52;
/**
 * @author Manuel Martin Gimeno
 */
public class ListaDeProducto {

	// Attributes
	private ProductoListable primero;

	// Builders
	public ListaDeProducto() {
		this.primero = null;
	}

	// Getters and Setters
	public ProductoListable getprimero() {
		return primero;
	}

	public void setPrimero(ProductoListable primero) {
		this.primero = primero;
	}

	// Methods
	public void add(ProductoListable p) {
		if (this.primero == null) {
			this.primero = p;
		} else {
			ProductoListable aux = this.primero;
			while (aux.getProductoSiguiente() != null) {
				aux = aux.getProductoSiguiente();
			}
			aux.setProductoSiguiente(p);
		}
	}
		
	public double precioTotal() {
		double result = 0.0;
		
		return result;
	}
	
	public ProductoListable search(String s) {
		ProductoListable result = this.primero;
		while (!result.getDescripcion().equals(s)) {
			result = result.getProductoSiguiente();
		}
		return result;
	}
	
	public void remove(String s) {
		ProductoListable aux = primero;
		if (aux.getProductoSiguiente() == null) {
			aux = null;
		} else {
			ProductoListable anterior = null;
			ProductoListable siguiente = primero.getProductoSiguiente();
			while (!aux.getDescripcion().equals(s)) {
				anterior = aux;
				aux = aux.getProductoSiguiente();
				siguiente = aux.getProductoSiguiente();
			}
			anterior.setProductoSiguiente(siguiente);
		}
		
	}

}
