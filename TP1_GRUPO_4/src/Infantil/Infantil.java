package Infantil;

import Entrada.Evento;

public class Infantil extends Evento {

	/*<------------ATRIBUTOS-------------------->*/	
	
	private int id;
	private int edad;
	private boolean sourvenir;
	private static int contId = 0;
	
	/*<------------CONSTRUCTORES-------------------->*/	
	
	public Infantil() {
		super("Infantil");
		contId++;
		this.id = contId;
		this.edad = 8;
		this.sourvenir = true;
	}
	
	public Infantil(int age, boolean sour) {
		super("Infantil");
		contId++;
		this.id = contId;
		this.edad=age;
		this.sourvenir = sour;
	}
	
	/*<------------GETTERS AND SETTERS-------------->*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isSourvenir() {
		return sourvenir;
	}

	public void setSourvenir(boolean sourvenir) {
		this.sourvenir = sourvenir;
	}
	
	/*<------------TOSTRING()-------------->*/
	
	@Override
	public String toString() {
		return super.toString() + " ID infantil: " + id  + " Edad: " + edad;
	}
}
