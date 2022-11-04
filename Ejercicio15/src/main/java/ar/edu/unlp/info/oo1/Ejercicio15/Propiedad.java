package ar.edu.unlp.info.oo1.Ejercicio15;

import java.util.LinkedList;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private double precioPorNoche;
	private String direccion;
	private Usuario propietario;
	private LinkedList<DateLapse> fecha;
	
	public Propiedad(String nom, String des, Double pre, String dir, Usuario pro) {
		setNombre(nom);
		setDescripcion(des);
		setPrecioPorNoche(pre);
		setDireccion(dir);
		setPropietario(pro);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	public DateLapse getFecha() {
		return fecha;
	}

	public void setFecha(DateLapse fecha) {
		this.fecha = fecha;
	}
	
}
