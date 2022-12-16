package ar.edu.unlp.info.oo1.ej18;

import java.time.LocalDate;

public abstract class Contrato {
	
	private Empleado empleado;
	private LocalDate fechaInicio;

	protected Contrato(Empleado e, LocalDate f) {
		this.empleado = e;
		this.fechaInicio = f;
	}
	
	abstract boolean estaVencido();
	abstract double calcularMontoBasico();
	
	public double calcularMontoFinal() {
		if (this.empleado.calcularAntiguedad() < 5)
			return this.calcularMontoBasico();
		if (this.empleado.calcularAntiguedad() < 10)
			return this.calcularMontoBasico() + (this.calcularMontoBasico() * 0.30);
		if (this.empleado.calcularAntiguedad() < 15)
			return this.calcularMontoBasico() + (this.calcularMontoBasico() * 0.50);
		if (this.empleado.calcularAntiguedad() < 20)
			return this.calcularMontoBasico() + (this.calcularMontoBasico() * 0.70);
		else
			return this.calcularMontoBasico() * 2;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

}
