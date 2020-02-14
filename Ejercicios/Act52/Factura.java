package Act52;

/**
 * @author Manuel Martin Gimeno
 */
public class Factura {

	// Attributes
	private int numeroFactura;
	// Atributo que irá calculando la cantidad de facturas que hay, para utilizarlo
	// en el número de factura
	private static int cantidadFacturas;
	private String nombreCliente;
	private Fecha fecha;
	private static int iva;
	private boolean pagado;
	private ListaDeProducto listaProductos;

	// Builder
	public Factura(String nombreCliente, Fecha fecha) {
		setCantidadFacturas(getCantidadFacturas() + 1);
		this.numeroFactura = getCantidadFacturas();
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.pagado = false;
	}

	// Getters and Setters
	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public static int getCantidadFacturas() {
		return cantidadFacturas;
	}

	public static void setCantidadFacturas(int cantidadFacturas) {
		Factura.cantidadFacturas = cantidadFacturas;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public static int getIva() {
		return iva;
	}

	public static void setIva(int iva) {
		Factura.iva = iva;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public ListaDeProducto getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ListaDeProducto listaProductos) {
		this.listaProductos = listaProductos;
	}

	// Methods
	public double calculaTotal() {
		double result = this.listaProductos.precioTotal() * getIva();
		return result;
	}
	
	public void añadirItem(ProductoListable p) {
		this.listaProductos.add(p);
	}
	
	public ProductoListable buscarItem(String s) {
		return this.listaProductos.search(s);
	}
	
	public void eliminarItem(String s) {
		this.listaProductos.remove(s);
	}
}
