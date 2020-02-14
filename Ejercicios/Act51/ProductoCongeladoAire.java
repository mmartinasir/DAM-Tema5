package Act51;
/**
 * @author Manuel Martín Gimeno
 * 
 */
public class ProductoCongeladoAire extends ProductoCongelado {

	// Attributes
	private double porcentajeNitrogeno;
	private double porcentajeOxigeno;
	private double porcentajeDioxidoCarbono;
	private double porcentajeVaporAgua;
	
	//Builder
	public ProductoCongeladoAire(String fecha, int numero, String fechaEnvasado, String paisOrigen,
			double temperaturaRecomendada, double porcentajeNitrogeno, double porcentajeOxigeno,
			double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
		super(fecha, numero, fechaEnvasado, paisOrigen, temperaturaRecomendada);
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeOxigeno = porcentajeOxigeno;
		this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

}
