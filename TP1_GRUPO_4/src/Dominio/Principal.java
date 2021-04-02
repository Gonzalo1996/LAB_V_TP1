package Dominio;

import Recital.Banda;
import Recital.Genero;
import Recital.Recital;
import Teatro.Actores;
import Teatro.GeneroTeatro;
import Teatro.Teatro;


public class Principal {

	public static void main(String[] args) {
		
		Banda b = new Banda(1,"Los piojos");
		Genero g = new Genero(1, "Rock");
		
		Recital recital = new Recital(b,g,"La renga");
		Recital recital2 = new Recital(b,g,"Los gardelitos");
		
		System.out.println(recital.toString());
		System.out.println(recital2.toString());
		
		GeneroTeatro generoA = new GeneroTeatro(1, "terror");
		Actores actorA = new Actores(1, "Facundo Arana");
		
		Teatro teatroA = new Teatro("Gran rex", generoA, actorA, actorA, actorA);
		Teatro teatroB = new Teatro("Luna Park", generoA, actorA, actorA, actorA);		
		
		System.out.println(teatroA.toString());
		System.out.println(teatroB.toString());
		
		
		
		
	}
}
