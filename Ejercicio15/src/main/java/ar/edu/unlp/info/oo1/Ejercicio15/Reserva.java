package ar.edu.unlp.info.oo1.Ejercicio15;

public class Reserva {
	private Propiedad propiedad;
	private DateLapse periodo;
	private Usuario inquilino;
	
	public Reserva (Propiedad pro, DateLapse per, Usuario inq) {
		setPropiedad(pro);
		setPeriodo(per);
		setInquilino(inq);
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}

	public Usuario getInquilino() {
		return inquilino;
	}

	public void setInquilino(Usuario inquilino) {
		this.inquilino = inquilino;
	}
	
	
	
}
