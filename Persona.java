package ejercicios;

public abstract class Persona {
	protected String nombre;
	protected String dni;
	protected String correo;
	
	public Persona(String nombre, String dni, String correo) {
		this.nombre = nombre;
		this.dni = dni;
		this.correo = correo;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Correo: " + correo);
	}
	
	public abstract void mostrarRol();

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getCorreo() {
		return correo;
	}
}


