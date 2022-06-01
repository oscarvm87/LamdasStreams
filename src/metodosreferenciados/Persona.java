package metodosreferenciados;


public class Persona {

	private String nombre;
	private Integer edad;
	
		
	public Persona() {}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Nombre: " +this.nombre +", edad: "+ this.edad;
	}
	
	public static int comparaEdad(Persona p1, Persona p2) {
		return p1.getEdad().compareTo(p2.getEdad());
	}
}
