package ar.edu.unlp.info.oo1.ej19;

public class Producto {
	
		private String nombre;
		private String descripcion;
		private double precio;
		private int cantidad;
		private Vendedor vendedor;
		
		public Producto(String n, String d, double p, int c, Vendedor v) {
			this.nombre = n;
			this.descripcion = d;
			this.precio = p;
			this.cantidad = c;
			this.vendedor = v;
		}

		public String getNombre() {
			return nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public double getPrecio() {
			return precio;
		}

		public int getCantidad() {
			return cantidad;
		}

		public Vendedor getVendedor() {
			return vendedor;
		}
		
		public void reducirExistencias(int i) {
			this.cantidad -= i;
		}
		
		
		

}
