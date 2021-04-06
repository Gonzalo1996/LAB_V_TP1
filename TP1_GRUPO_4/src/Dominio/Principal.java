package Dominio;

import java.util.Date;

import Deportes.Deportes;
import Deportes.DeportesTipo;
import Entrada.Entrada;
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
		Infantil infantil = new Infantil(8,true);

		//TEATRO
		GeneroTeatro generoA = new GeneroTeatro(1, "terror");
		Actores actorA = new Actores(1, "Facundo Arana");		
		Teatro teatroA = new Teatro("Gran Rex", generoA, actorA);

		//RECITAL
		Banda b = new Banda(1,"Los piojos");
		Genero g = new Genero(1, "Rock");		
			//TRUE es entrada VIP, FALSE es general. Si no ingresa ninguna es general pro defecto.
		Recital recital = new Recital(b,g,"La 25",true);	
		
		//DEPORTES
		DeportesTipo[] vecTipo = new DeportesTipo[3];
		vecTipo[0] = new DeportesTipo("Futbol",300);
		vecTipo[1] = new DeportesTipo("Rugby",450);
		vecTipo[2] = new DeportesTipo ("Hockey",380);

		Deportes depo1 = new Deportes(vecTipo[2] ,true);	
		
			//SETEO FECHAS Y MINUTOS
        Date fecha = new Date(121, 3,6, 20, 30);		
		infantil.setFechahora(fecha);
		infantil.setMinutos(100);	
		depo1.setFechahora(fecha);
		depo1.setMinutos(90);
		recital.setFechahora(fecha);
		recital.setMinutos(30);
		teatroA.setFechahora(fecha);
		teatroA.setMinutos(45);
		
			//SETEO NOMBRE DE EVENTOS
		infantil.setNombre("Panam y sus niños");
		recital.setNombre("Los piojos en vivo");	
		depo1.setNombre("Superclasico");
			
			//SETEO EVENTOS
		Entrada entrada = new Entrada(recital);
		Entrada entrada2 = new Entrada(teatroA);
		Entrada entrada3 = new Entrada(depo1);
		Entrada entrada4 = new Entrada(infantil);
		
		System.out.println(entrada.toString());
		System.out.println(entrada2.toString());
		System.out.println(entrada3.toString());
		System.out.println(entrada4.toString());	
	}
}
