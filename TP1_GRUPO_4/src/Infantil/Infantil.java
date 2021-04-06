package Infantil;

import Entrada.Evento;

public class Infantil extends Evento {

	/*<------------ATRIBUTOS-------------------->*/	
	
	private int id;
	private int edad;
	private boolean sourvenir;
	private static int contId = 0;
	private double precio;
	
	/*<------------CONSTRUCTORES-------------------->*/	
	
	public Infantil() {
		super("Infantil");
		contId++;
		this.id = contId;
		this.edad = 8;
		this.sourvenir = true;
		this.precio = 250;
	}
	
	public Infantil(int age, boolean sour) {
		super("Infantil");
		contId++;
		this.id = contId;
		this.edad=age;
		this.sourvenir = sour;
		
		if(age >= 8) {
			this.precio = 500;
		}
		else{
			this.precio = 250;
		}
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
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}	
	
	/*<------------TOSTRING()-------------->*/

	@Override
	public String toString() {
		if(this.sourvenir) {
			return super.toString() + " ID infantil: " + id + " Edad: " + edad + " Precio: $" + precio + " CON SOUVENIR";
		}
		else {
			return super.toString() + " ID infantil: " + id + " Edad: " + edad + " Precio: $" + precio + " SIN SOUVENIR";
		}
		
	}
}
