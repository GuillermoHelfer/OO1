package ar.edu.unlp.info.oo1.ej19;

import java.util.List;

public class Cliente extends Persona{
	
	private List<Pedido> pedidos;

	public Cliente(String n, String d) {
		super(n, d);
	}
	
	public void agregarPedido(Pedido p) {
		this.pedidos.add(p);
	}

}
