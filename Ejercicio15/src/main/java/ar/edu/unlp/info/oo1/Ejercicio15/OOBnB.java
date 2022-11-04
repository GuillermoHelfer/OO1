package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OOBnB {
	private LinkedList<Usuario> userList;
	private LinkedList<Propiedad> propList;
	
	public void RegistrarUsuraio(String nom, String dir, String dni) {
		userList.add(new Usuario(nom,dir,dni));
	}
	
	public void RegistrarPropiedadEnAlquiler(String nom, String des, double pre, String dir, Usuario user) {
		propList.add(new Propiedad(nom, des, pre, dir, user));
	}
	
	public List<Propiedad> BuscarPropiedadesDisponiblesEnUnPeriodo (DateLapse periodo){
		return propList.stream().filter( propiedad -> propiedad.verificarDisponibilidad(periodo)).collect(Collectors.toList());
	}
	
	public void HacerUnaReserva(Propiedad pro, DateLapse per, Usuario inq) {
		if (pro.verificarDisponibilidad(per)) {
			pro.agregarReserva(per, inq);
			inq.agregarReserva(pro, per, inq);
		}
	}
	
	public void eliminarUnaReserva(Reserva rese) {
		if(rese.getPeriodo().getFrom().isAfter(LocalDate.now())) {
			rese.getInquilino().eliminarReserva(rese);
			rese.getPropiedad().eliminarReserva(rese);
		}
	}
	
	public double obtenerReservasDePropietario(Usuario prop, LocalDate f, LocalDate t){
		return prop.calcularIngresosPropietario(f, t);
	}
	
}
