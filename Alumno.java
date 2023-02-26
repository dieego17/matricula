package matricula;

public class Alumno {

	private String clave;
	private String dni;
	private String email;
	private String nombre;
	
	
	public Alumno() {
		this.clave="";
		this.dni="";
		this.email="";
		this.nombre="";
	}
	
	public Alumno(String clave, String dni, String email, String nombre) {
		this.clave = clave;
		this.dni = dni;
		this.email = email;
		this.nombre = nombre;
	}
	
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "Alumno [clave=" + clave + ", dni=" + dni + ", email=" + email + ", nombre=" + nombre + "]";
	}
	
	
	public boolean equals(Alumno a) {
		return a.getDni().equals(this.getDni());
	}
	
}
