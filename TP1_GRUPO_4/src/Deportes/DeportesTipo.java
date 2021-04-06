package Deportes;

public class DeportesTipo {
	
	private int id;
	private static int contId = 0;
	private String Nombre;
	private double precio; 
	
	//Constructores
	public DeportesTipo() {
		contId ++;
		this.id = contId;
		this.Nombre="Sin nombre";
	}
	
	public DeportesTipo(String nombre, double precio) {
		contId ++;
		this.id = contId;
		this.Nombre=nombre;
		this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Metodo ToString
	@Override
	public String toString() {
		return "DeportesTipo [id=" + id + ", Nombre=" + Nombre +" Precio: $"+ precio;
	}

}
