package Teatro;

import Entrada.Evento;

public class Teatro extends Evento {
	
	private int id;
	private String nombre;
	private GeneroTeatro genero;
	private Actores actorA;
	private Actores actorB;
	private Actores actorC;
	private static int contId = 0;
	
/*<------------CONSTRUCTORES-------------------->*/	
	
	public Teatro() {
		super("Teatro");
		contId++;
		this.id = contId;
		this.nombre = "Sin nombre";
	}
	
	public Teatro(String nombre, GeneroTeatro genero, Actores actorA, Actores actorB, Actores actorC) {
		super("Teatro");
		contId++;
		this.id = contId;
		this.nombre = nombre;
		this.genero = genero;
		this.actorA = actorA;
		this.actorB = actorB;
		this.actorC = actorC;
	}
	
/*<------------GETTERS AND SETTERS-------------->*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public GeneroTeatro getGenero() {
		return genero;
	}
	public void setGenero(GeneroTeatro genero) {
		this.genero = genero;
	}

	public Actores getActorA() {
		return actorA;
	}

	public void setActorA(Actores actorA) {
		this.actorA = actorA;
	}

	public Actores getActorB() {
		return actorB;
	}

	public void setActorB(Actores actorB) {
		this.actorB = actorB;
	}

	public Actores getActorC() {
		return actorC;
	}

	public void setActorC(Actores actorC) {
		this.actorC = actorC;
	}

	@Override
	public String toString() {
		return super.toString() + " ID teatro: " + id + ". Nombre: " + nombre + ". Genero: " + genero.getNombre() + ". Actores: " + actorA.getNombre() + "," + actorB.getNombre() + 
				"," + actorC.getNombre() + ".";
	}	
}
