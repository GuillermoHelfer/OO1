package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private String dni;
	private int vecesAlquiladas;
	private List<Propiedad> propAlqList;
	private List<Reserva> reservaList;
	
	public Usuario(String nom, String dir, String dni) {
		setNombre(nom);
		setDireccion(dir);
		setDni(dni);
		propAlqList = new LinkedList<Propiedad>();
		reservaList = new LinkedList<Reserva>();
		vecesAlquiladas = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getVecesAlquiladas() {
		return vecesAlquiladas;
	}

	public void setVecesAlquiladas(int vecesAlquiladas) {
		this.vecesAlquiladas = vecesAlquiladas;
	}
	
	public Propiedad agregarPropiedad(String nom, String des, double pre, String dir) {
		Propiedad p = new Propiedad(nom,des,pre,dir,this);
		this.propAlqList.add(p);
		return p;
	}
	
	public Reserva agregarReserva(Propiedad pro, DateLapse per, Usuario inq) {
		Reserva r = new Reserva(pro,per,inq);
		this.reservaList.add(r);
		return r;
	}
	
	public void eliminarReserva(Reserva rese) {
		reservaList.remove(rese);
	}
	
	public List<Reserva> obtenerReservasEfectuadas(){
		return reservaList;
	}
	
	public double calcularIngresosPropietario(LocalDate f, LocalDate t) {
		return propAlqList.stream()
				.mapToDouble( r -> r.calcularingresosEntreDosFechas(f, t))
				.sum();
	}
	
}
