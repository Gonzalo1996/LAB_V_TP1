package Entrada;

import Deportes.Deportes;

public class EntradaDeporte extends Entrada{
	
	public EntradaDeporte() {
		super();
	}
	
	public EntradaDeporte(Deportes deporte) {
		super(deporte);
	}
	
	@Override
	public double getPrecio() {
		return 0;
	}
}
