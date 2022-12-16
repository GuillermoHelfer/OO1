package ar.edu.unlp.info.oo1.ej18;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato{
	
	private double valorHora;
	private int cantHoras;
	private LocalDate fechaFin;
	
	public ContratoPorHoras (Empleado e, LocalDate ini, double v, int c, LocalDate fin) {
		super(e,ini);
		this.valorHora = v;
		this.cantHoras = c;
		this.fechaFin = fin;
	}

	public double getValorHora() {
		return valorHora;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	@Override
	public boolean estaVencido() {
		return LocalDate.now().isBefore(fechaFin);
	}

	@Override
	double calcularMontoBasico() {
		return this.valorHora * this.cantHoras;
	}
	
}
