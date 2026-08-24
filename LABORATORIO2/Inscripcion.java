package ejercicios;

public class Inscripcion {
	private Estudiante estudiante;
	private Curso curso;
	
	public Inscripcion(Estudiante estudiante, Curso curso) {
		this.estudiante = estudiante;
		this.curso = curso;
	}
	
	public void mostrarInformacion() {
		System.out.println("Estudiante: " + estudiante.getNombre());
		
		System.out.println("Curso: " + curso.getNombre());
	}
}


