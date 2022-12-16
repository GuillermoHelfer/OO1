package ar.edu.unlp.info.oo1.ej19;

public class Pedido {

	private Cliente cliente;
	private Producto producto;
	private int cantidad;
	private MetodoPago metodo;
	private FormaEnvio envio;
	
	
	public Pedido(Cliente cl, Producto pr, int ca, MetodoPago me, FormaEnvio en) {
		this.cliente = cl;
		this.producto = pr;
		this.cantidad = ca;
		this.metodo = me;
		this.envio = en;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public MetodoPago getMetodo() {
		return metodo;
	}

	public FormaEnvio getEnvio() {
		return envio;
	}
	
	public double calcularCostoTotal() {
		return getProducto().getPrecio() * metodo.calcularCostoPago() + envio.calcularCostoEnvio();
	}

}
