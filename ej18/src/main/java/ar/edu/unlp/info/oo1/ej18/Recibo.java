package ar.edu.unlp.info.oo1.ej18;

import java.time.LocalDate;

public class Recibo {
	private String nombre;
	private String apellido;
	private String cuil;
	private int antiguedad;
	private LocalDate fecha;
	private double monto;
	
	
	public Recibo(String no, String ap, String cu, int an, double mo) {
		this.nombre = no;
		this.apellido = ap;
		this.cuil = cu;
		this.antiguedad = an;
		this.fecha = LocalDate.now();
		this.monto = mo;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getCuil() {
		return cuil;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
