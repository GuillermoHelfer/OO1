package ar.edu.unlp.info.oo1.ej18;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato{
	
	private double sueldoMensual;
	private double extraConyugue;
	private double extraHijos;
	
	public ContratoDePlanta (Empleado e, LocalDate ini, double sM, double eC, double eH) {
		super(e,ini);
		this.sueldoMensual = sM;
		this.extraConyugue = eC;
		this.extraHijos = eH;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public double getExtraConyugue() {
		return extraConyugue;
	}

	public double getExtraHijos() {
		return extraHijos;
	}

	@Override
	public boolean estaVencido() {
		return false;
	}

	@Override
	double calcularMontoBasico() {
		return this.sueldoMensual + this.extraConyugue + this.extraHijos;
	}
	
}
