package Recital;

import Entrada.Evento;

public class Recital extends Evento {
	
	private int id;
	private Banda banda;
	private Genero genero;
	private String bandaSoporte;
	private String bandaSoporte2;

	private static int contId = 0;
	
	public Recital() {
		super("Recital");
		contId ++;
		this.id = contId;
	}

	
	public Recital(Banda banda, Genero genero, String bandaSoporte, String bandaSoporte2) {
		super("Recital");
		contId ++;
		this.id = contId;
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte = bandaSoporte;
		this.bandaSoporte2 = bandaSoporte2;
	}
	
	public Recital(Banda banda, Genero genero, String bandaSoporte) {
		super("Recital");
		contId ++;
		this.id = contId;
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte = bandaSoporte;
		this.bandaSoporte2 = "Sin banda soporte";
	}

	public int getId() {
		return id;
	}
	
	public Banda getBanda() {
		return banda;
	}
	public void setBanda(Banda banda) {
		this.banda = banda;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	

	public String getBandaSoporte() {
		return bandaSoporte;
	}

	public void setBandaSoporte(String bandaSoporte) {
		this.bandaSoporte = bandaSoporte;
	}

	public String getBandaSoporte2() {
		return bandaSoporte2;
	}

	public void setBandaSoporte2(String bandaSoporte2) {
		this.bandaSoporte2 = bandaSoporte2;
	}

	@Override
	public String toString() {
		return super.toString() + " ID recital: " + id  + " Banda: " + banda.getNombre() + " Genero: " + genero.getNombre() +
				" Banda Soporte: " + bandaSoporte + " Soporte 2 :" + bandaSoporte2;
	}
}
