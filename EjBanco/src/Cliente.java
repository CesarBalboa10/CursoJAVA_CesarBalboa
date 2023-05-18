
public class Cliente {

	private String nombre;
	private int numIdentificacion;
	
	public Cliente(String nombre, int numIdentificacion) {
		super();
		this.nombre = nombre;
		this.numIdentificacion = numIdentificacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getNumIdentificacion() {
		return numIdentificacion;
	}
	
}
