package ar.edu.unlp.info.oo1.ej19;

import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	
	private List<Vendedor> vendedores;
	private List<Cliente> clientes;
	private List<Producto> productos;
	private List<Pedido> pedidos;
	
	
	public Vendedor registrarVendedor (String n, String d) {
		Vendedor v = new Vendedor(n,d);
		this.vendedores.add(v);
		return v;
	}
	
	public Vendedor buscarVendedor (String nombre) {
		return this.vendedores.stream()
					.filter(v -> v.getNombre().equals(nombre))
					.findFirst().orElse(null);
	}
	
	public Cliente registrarCliente(String n, String d) {
		Cliente c = new Cliente(n,d);
		this.clientes.add(c);
		return c;
	}
	
	public Cliente buscarCliente (String nombre) {
		return this.clientes.stream()
					.filter(c -> c.getNombre().equals(nombre))
					.findFirst().orElse(null);
	}
	
	public Producto venderProducto (String n, String d, double p, int c, Vendedor v) {
		Producto prod = new Producto (n,d,p,c,v);
		this.productos.add(prod);
		v.agregarVenta(prod);
		return prod;
	}
	
	public List<Producto> buscarProducto(String n) {
		return this.productos.stream()
							.filter(p -> p.getNombre().equals(n))
							.collect(Collectors.toList());
	}
	
	public Pedido crearPedido (Cliente c, Producto p, int cant, MetodoPago metodo, FormaEnvio envio) {
		if(p.getCantidad() >= cant) {
			Pedido pedido = new Pedido(c,p,cant,metodo,envio);
			this.pedidos.add(pedido);
			c.agregarPedido(pedido);
			p.reducirExistencias(cant);
			return pedido;
		}
		return null;
	}
	
	public double calcularCostoTotalEnvio(Pedido p) {
		return p.calcularCostoTotal();
	}
	
	
	

}
