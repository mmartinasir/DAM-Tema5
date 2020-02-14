package Act51;
/**
 * @author Manuel Martín Gimeno
 * 
 */
public class ProductoRefrigerado extends Producto {

	// Attributes
	private int codigoSupervision;
	private String fechaEnvasado;
	private double temperaturaRecomendada;
	private String paisOrigen;

	public ProductoRefrigerado(String fecha, int numero, int codigoSupervision, String fechaEnvasado,
			double temperaturaRecomendada, String paisOrigen) {
		super(fecha, numero);
		this.codigoSupervision = codigoSupervision;
		this.fechaEnvasado = fechaEnvasado;
		this.temperaturaRecomendada = temperaturaRecomendada;
		this.paisOrigen = paisOrigen;
	}

}
