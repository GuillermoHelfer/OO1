package ar.edu.unlp.info.oo1.ej18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Empleado {
	private String nombre;
	private String apellido;
	private String cuil;
	private Date nacimiento;
	private boolean tieneConyugue;
	private boolean tieneHijos;
	private LocalDate inicioTrabajo;
	private List<Contrato> contratos;
	
	public Empleado (String no, String ap, String cuil, Date na, boolean tC, boolean tH) {
		this.nombre = no;
		this.setApellido(ap);
		this.cuil = cuil;
		this.nacimiento = na;
		this.tieneConyugue = tC;
		this.tieneHijos = tH;
		this.inicioTrabajo = LocalDate.now();
		this.contratos = new LinkedList<>();
	}

	public String getCuil() {
		return this.cuil;
	}
	
	public boolean contratosVencidos() {
		return this.contratos.stream().allMatch(Contrato::estaVencido);
	}
	
	public List<Contrato> contratosActivos() {
		return this.contratos.stream()
							.filter(c -> !c.estaVencido())
							.collect(Collectors.toList());
	}
	
	public void registrarContratoPorHoras(LocalDate ini, LocalDate fin, double vH, int cH) {
		if (contratosVencidos())
			this.contratos.add(new ContratoPorHoras(this,ini,vH,cH,fin));
	}

	public void registrarContratoDePlanta(LocalDate ini, double sM, double mC, double mH) {
		if (contratosVencidos())
			this.contratos.add(new ContratoDePlanta(this,ini,sM,mC,mH));
	}
	
	public int calcularAntiguedad() {
		return (int) ChronoUnit.YEARS.between(inicioTrabajo, LocalDate.now());
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public boolean isTieneConyugue() {
		return tieneConyugue;
	}

	public boolean isTieneHijos() {
		return tieneHijos;
	}
	
	public LocalDate getInicioTrabajo() {
		return this.inicioTrabajo;
	}
	
	public double obtenerMonto() {
		return this.contratosActivos().stream()
						.mapToDouble(Contrato::calcularMontoFinal)
						.sum();
	}
	
}
