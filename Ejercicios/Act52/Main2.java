package Act52;
/**
 * @author Manuel Martin Gimeno
 */
public class Main2 {

	public static void main(String[] args) {
		ListaDeProducto lista = new ListaDeProducto();
		ProductoListable p1 = new ProductoListable("Agua",10,5.3);
		ProductoListable p2 = new ProductoListable("Aceite",4,20.5);
		ProductoListable p3 = new ProductoListable("Sal",50,7.0);
		ProductoListable p4 = new ProductoListable("Vino",50,7.0);
		Fecha fecha1 = new Fecha(13,10,1990);
		Factura fact1 = new Factura("Pepe", fecha1);
		fact1.setListaProductos(lista);
		fact1.setIva(25);

		
		fact1.añadirItem(p1);
		fact1.añadirItem(p2);
		fact1.añadirItem(p3);
		fact1.añadirItem(p4);
		
		fact1.eliminarItem("Sal");
		
		System.out.println(fact1.buscarItem("Vino").getDescripcion());
	}

}
