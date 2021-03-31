package Dominio;

import Recital.Banda;
import Recital.Genero;
import Recital.Recital;

public class Principal {

	public static void main(String[] args) {
		
		Banda b = new Banda(1,"Los piojos");
		Genero g = new Genero(1, "Rock");
		Recital recital = new Recital(b,g,"La renga");
		System.out.println(recital.toString());
	}
}
