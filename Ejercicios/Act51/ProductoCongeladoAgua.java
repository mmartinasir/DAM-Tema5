package Act51;
/**
 * @author Manuel Martín Gimeno
 * 
 */
public class ProductoCongeladoAgua extends ProductoCongelado {
	
	//Attributes
	private double gramosSal;
	private double litroAgua;

	public ProductoCongeladoAgua(String fecha, int numero, String fechaEnvasado, String paisOrigen,
			double temperaturaRecomendada, double gramosSal, double litroAgua) {
		super(fecha, numero, fechaEnvasado, paisOrigen, temperaturaRecomendada);
		this.gramosSal = gramosSal;
		this.litroAgua = litroAgua;
	}

}
