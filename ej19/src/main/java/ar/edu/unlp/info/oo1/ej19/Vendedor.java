package ar.edu.unlp.info.oo1.ej19;

import java.util.List;

public class Vendedor extends Persona{

	private List<Producto> productoEnVenta;
	
	public Vendedor(String n, String d) {
		super(n, d);
	}
	
	public void agregarVenta(Producto p) {
		this.productoEnVenta.add(p);
	}

}
