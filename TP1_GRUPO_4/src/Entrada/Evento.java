package Entrada;

import java.sql.Date;
import java.text.MessageFormat;

public abstract class Evento {
	private String nombre;
	private String tipoEvento;
	private Date fecha;

	public Evento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Evento(String tipoEvento, String nombre) {
		this.tipoEvento = tipoEvento;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return MessageFormat.format("Nombre: {0}. Tipo de evento: {1}.", nombre, tipoEvento);
	}
}
