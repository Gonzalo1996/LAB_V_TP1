package Recital;

import Entrada.Evento;

public class Recital extends Evento{
	
	private int id;
	private Banda banda;
	private Genero genero;
	private String bandaSoporte;
	private String bandaSoporte2;
	private boolean entradavip;
	private double precio;

	private static int contId = 0;
	
	public Recital() {
		super("Recital");
		contId ++;
		this.id = contId;
		this.precio = 800;
	}
	
		//EN CASO QUE NO TENGA BANDA SOPORTE
	
	public Recital(Banda banda, Genero genero, boolean entradavip) {
		super("Recital");
		contId ++;
		this.id = contId;
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte = "Sin banda soporte 1";
		this.bandaSoporte2 = "Sin banda soporte 2";
		if(entradavip) {
			this.precio = 1500;
		}
		else {
			this.precio = 800;
		}
	}
	
	public Recital(Banda banda, Genero genero) {
		super("Recital");
		contId ++;
		this.id = contId;
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte = "Sin banda soporte 1";
		this.bandaSoporte2 = "Sin banda soporte 2";
		this.precio = 800;
	}
	
	//EN CASO QUE TENGA DOS BANDAS SOPORTES

	public Recital(Banda banda, Genero genero, String bandaSoporte, String bandaSoporte2) {
		super("Recital");
		contId ++;
		this.id = contId;
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte = bandaSoporte;
		this.bandaSoporte2 = bandaSoporte2;
		this.precio = 800;
	}
	
	public Recital(Banda banda, Genero genero, String bandaSoporte) {
		super("Recital");
		contId ++;
		this.id = contId;
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte = bandaSoporte;
		this.bandaSoporte2 = "Sin banda soporte 2";
		this.precio = 800;
	}

		//EN CASO QUE TENGA DOS BANDAS SOPORTES Y ESPECIFIQUE TIPO DE ENTRADA
	public Recital(Banda banda, Genero genero, String bandaSoporte, String bandaSoporte2, boolean entradavip) {
		super("Recital");
		contId ++;
		this.id = contId;
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte = bandaSoporte;
		this.bandaSoporte2 = bandaSoporte2;
		if(entradavip) {
			this.precio = 1500;
		}
		else {
			this.precio = 800;
		}
	}
	
	public Recital(Banda banda, Genero genero, String bandaSoporte, boolean entradavip) {
		super("Recital");
		contId ++;
		this.id = contId;
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte = bandaSoporte;
		this.bandaSoporte2 = "Sin banda soporte 2";
		if(entradavip) {
			this.precio = 1500;
		}
		else {
			this.precio = 800;
		}
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
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return super.toString() + " ID recital: " + id  + " Banda: " + banda.getNombre() + " Genero: " + genero.getNombre() +
								 " Precio: $ " + getPrecio() + " Banda Soporte: " + bandaSoporte + " Soporte 2 :" + bandaSoporte2;
	}
}
