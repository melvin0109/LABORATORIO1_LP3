package ejercicios;

public class Profesor extends Persona{
	
	private String especialidad;
	private static int cantidadProfesores = 0;
	
	public Profesor(String nombre,String dni,String correo, String especialidad) {
		super(nombre,dni,correo);
		this.especialidad = especialidad;
		
		cantidadProfesores++;
	}
	
	public void asignarCurso(Curso curso) {
		curso.setProfesor(this);
		
		System.out.println("El profesor " + nombre + " fue asignado al curso " + curso.getNombre());

	}
	
	@Override
	public void mostrarRol() {
		System.out.println("Rol: Profesor");
	}
	
	public static int getCantidadProfesores() {
		return cantidadProfesores;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
}



