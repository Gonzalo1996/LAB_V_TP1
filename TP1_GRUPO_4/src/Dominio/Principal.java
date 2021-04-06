package Dominio;

import java.util.Date;

import Deportes.Deportes;
import Deportes.DeportesTipo;
import Entrada.Entrada;
import Entrada.EntradaDeporte;
import Entrada.EntradaInfantil;
import Entrada.EntradaRecital;
import Entrada.EntradaTeatro;
import Infantil.Infantil;
import Recital.Banda;
import Recital.Genero;
import Recital.Recital;
import Teatro.Actores;
import Teatro.GeneroTeatro;
import Teatro.Teatro;

public class Principal {

	public static void main(String[] args) {
			
		//INFANTIL
		Infantil infantil = new Infantil(true);

		//TEATRO
		GeneroTeatro generoA = new GeneroTeatro(1, "terror");
		Actores actorA = new Actores(1, "Facundo Arana");		
		Teatro teatroA = new Teatro("Gran Rex", generoA, actorA, null, null);

		//RECITAL
		Banda b = new Banda(1,"Los piojos");
		Genero g = new Genero(1, "Rock");
		Banda s1 = new Banda(2, "La 25");
		Recital recital = new Recital(b,g, s1, null);
		
		//DEPORTES
		DeportesTipo[] vecTipo = new DeportesTipo[3];
		vecTipo[0] = new DeportesTipo("Futbol");
		vecTipo[1] = new DeportesTipo("Rugby");
		vecTipo[2] = new DeportesTipo ("Hockey");

		Deportes depo1 = new Deportes(vecTipo[2], false);
		
			//SETEO FECHAS Y MINUTOS
        Date fecha = new Date(121, 3,6, 20, 30);		
		infantil.setFechahora(fecha);
		infantil.setDuracion(100);	
		depo1.setFechahora(fecha);
		depo1.setDuracion(90);
		recital.setFechahora(fecha);
		recital.setDuracion(30);
		teatroA.setFechahora(fecha);
		teatroA.setDuracion(45);
		
			//SETEO NOMBRE DE EVENTOS
		infantil.setNombre("Panam y sus niños");
		recital.setNombre("Los piojos en vivo hoy");
		depo1.setNombre("Superclasico");
		teatroA.setNombre("Casados con hijos en vivo");
			
			//SETEO EVENTOS
		Entrada entrada = new EntradaRecital(recital, true);
		Entrada entrada2 = new EntradaTeatro(teatroA);
		Entrada entrada3 = new EntradaInfantil(infantil, 7);
		Entrada entrada4 = new EntradaDeporte(depo1);
		/*
		Entrada entrada3 = new Entrada(depo1);
		Entrada entrada4 = new Entrada(infantil);
		*/
		
		System.out.println(entrada.toString());
		System.out.println(entrada2.toString());
		System.out.println(entrada3.toString());
		System.out.println(entrada4.toString());

	}
}
