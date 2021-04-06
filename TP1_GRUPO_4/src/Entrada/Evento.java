package Entrada;

import java.util.Date;
import java.text.MessageFormat;

public abstract class Evento {
	private String nombre;
	private String tipoEvento;
	private Date fechahora;
	private int minutos;
	
	public Evento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Evento(String tipoEvento, String nombre, Date fechatexto, int minutos) {
		this.tipoEvento = tipoEvento;
		this.nombre = nombre;
		this.fechahora = fechatexto;
		this.minutos = minutos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Date getFechahora() {
		return fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return MessageFormat.format("Nombre: {0}. Tipo de evento: {1}. Fecha y hora: {2}. Minutos: {3}.", nombre, tipoEvento, fechahora, minutos);
	}
}
