package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse (LocalDate f, LocalDate t) {
		this.from = f;
		this.to = t;
	}
	
	public LocalDate getFrom() {
		return from;
	}
	//“Retorna la fecha de inicio del rango”

	public LocalDate getTo() {
		return to;
	}
	//“Retorna la fecha de fin del rango”

	public int sizeInDays() {
		return (int) from.until(to, ChronoUnit.DAYS);
	}
	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”

	public boolean includesDate(LocalDate other) {
		return (from.isBefore(other)&&(to.isAfter(other)));
	}
	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.\
	
	public boolean overlaps (DateLapse anotherDateLapse) {
		return ((from.isAfter(anotherDateLapse.getFrom()) && (from.isBefore(anotherDateLapse.getTo())))
				||(to.isAfter(anotherDateLapse.getFrom()) && (to.isBefore(anotherDateLapse.getTo()))));
	}
	/**
	Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
	**/


}
