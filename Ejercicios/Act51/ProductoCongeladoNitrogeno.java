package Act51;
/**
 * @author Manuel Martín Gimeno
 * 
 */
public class ProductoCongeladoNitrogeno extends ProductoCongelado {
	
	//Attributes
	private String informacionCongelacion;
	private int tiempoExposicion;

	public ProductoCongeladoNitrogeno(String fecha, int numero, String fechaEnvasado, String paisOrigen,
			double temperaturaRecomendada, String informacionCongelacion, int tiempoExposicion) {
		super(fecha, numero, fechaEnvasado, paisOrigen, temperaturaRecomendada);
		this.informacionCongelacion = informacionCongelacion;
		this.tiempoExposicion = tiempoExposicion;
	}

}
