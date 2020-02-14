package Act51;
/**
 * @author Manuel Martín Gimeno
 * 
 */
public class ProductoFresco extends Producto {
	
	//Attributes
	private String fechaEnvasado;
	private String paisOrigen;
	
	//Builders
	public ProductoFresco(String fecha, int numero, String fechaEnvasado, String paisOrigen) {
		super(fecha, numero);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

}
