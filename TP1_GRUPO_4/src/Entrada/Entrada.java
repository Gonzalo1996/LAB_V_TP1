package Entrada;

import java.text.MessageFormat;

public class Entrada {
	
	private int id;
	private Evento evento;
	private double precio;

	private static int contId = 0;
	
	public Entrada() {
		this.id = ++contId;
	}

	public Entrada(Evento evento, double precio) {
		this.id = ++contId;
		this.evento = evento;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return MessageFormat.format("ID Entrada: {0}. Evento: ({1}). Precio: {2,number,currency}.", id, evento, precio);
	}
}
