package Act51;

/**
 * @author Manuel Martín Gimeno
 * 
 */
public class ProductoCongelado extends Producto {

	// Attributes
	private String fechaEnvasado;
	private String paisOrigen;
	private double temperaturaRecomendada;

	public ProductoCongelado(String fecha, int numero, String fechaEnvasado, String paisOrigen,
			double temperaturaRecomendada) {
		super(fecha, numero);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

}
