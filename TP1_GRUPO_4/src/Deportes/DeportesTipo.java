package Deportes;

public class DeportesTipo {
	
	private int id;
	private String Nombre;

	
	
	//Constructores
	public DeportesTipo() {
		this.id=1;
		this.Nombre="Sin nombre";
	}
	
	public DeportesTipo(int id, String nombre) {
		this.id=id;
		this.Nombre=nombre;
	}

	
	// Getter y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	
	// Metodo ToString
	@Override
	public String toString() {
		return "DeportesTipo [id=" + id + ", Nombre=" + Nombre + "]";
	}

	
	
	
	
	
	
}
