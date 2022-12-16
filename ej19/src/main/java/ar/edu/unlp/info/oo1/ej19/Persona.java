package ar.edu.unlp.info.oo1.ej19;

public class Persona {

	private String nombre;
	private String direccion;
	
	public Persona(String n, String d) {
		this.nombre = n;
		this.direccion = d;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}

}
