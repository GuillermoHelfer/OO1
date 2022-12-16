package ar.edu.unlp.info.oo1.ej18;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {

	private List<Empleado> empleados;
	
	public Empleado altaEmpleado(String no, String ap, String cuil, Date na, boolean tC, boolean tH) {
		Empleado e = new Empleado(no,ap,cuil,na,tC,tH);
		this.empleados.add(e);
		return e;
	}
	
	public Empleado buscarEmpleado(String cuil) {
		return this.empleados.stream()
				.filter(e -> e.getCuil().equals(cuil))
				.findFirst()
				.orElse(null);
	}
	
	public void bajaEmpleado(String cuil) {
		this.empleados.remove(buscarEmpleado(cuil));
	}
	
	public void registrarContratoPorHoras (Empleado e, LocalDate ini, LocalDate fin, double vH, int cH) {
		e.registrarContratoPorHoras(ini,fin,vH,cH);
	}
	
	public void registrarContratoPorHoras (Empleado e, LocalDate ini, double sM, double mC, double mH) {
		e.registrarContratoDePlanta(ini,sM,mC,mH);
	}
	
	public List<Empleado> obtenerEmpleadosContratoVencido(){
		return this.empleados.stream()
						.filter(Empleado::contratosVencidos)
						.collect(Collectors.toList());
	}
	
	public Recibo hacerRecibo(Empleado e) {
		Recibo r = new Recibo(e.getNombre(), e.getApellido(), e.getCuil(), e.calcularAntiguedad(), e.obtenerMonto());
		return r;
	}
	
	public List<Recibo> generarRecibosDeCobro(){
		return this.empleados.stream()
						.filter(e->!e.contratosVencidos())
						.map(e -> this.hacerRecibo(e))
						.collect(Collectors.toList());
	}
	
}
