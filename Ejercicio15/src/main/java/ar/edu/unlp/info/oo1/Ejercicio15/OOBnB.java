package ar.edu.unlp.info.oo1.Ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class OOBnB {
	private LinkedList<Usuario> userList;
	private LinkedList<Propiedad> propList;
	
	public Usuario RegistrarUsuraio(String nom, String dir, String dni) {
		userList.add(new Usuario(nom,dir,dni));
		return userList.getLast();
	}
	
	public Propiedad RegistrarPropiedadEnAlquiler(String nom, String des, double pre, String dir, Usuario user) {
		return userList.stream()
					.filter(Usuario -> Usuario.getDni() == user.getDni())
					.findFirst().orElse(null)
					.agregarPropiedad(nom, des, pre, dir);
	}
	
	public List<Propiedad> BuscarPropiedadesDisponiblesEnUnPeriodo ( DateLapse periodo){
		return this.propList.stream().
	}
	
	public Reserva HacerUnaReserva(Propiedad pro, DateLapse per, Usuario inq) {
		return propList.stream()
				.filter(Propiedad -> Propiedad.getDireccion() == pro.getDireccion())
				.findFirst().orElse(null)
				.agregarReserva(pro, per, inq);
	}
	
	
}
