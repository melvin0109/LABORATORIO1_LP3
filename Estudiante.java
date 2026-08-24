package ejercicios;
import java.util.ArrayList;

public class Estudiante extends Persona {
	
	private String codigoEstudiante;
	private static int cantidadEstudiantes = 0;
	
	public Estudiante(String nombre,String dni, String correo,String codigoEstudiante) {
		
		super(nombre,dni,correo);
		
		this.codigoEstudiante = codigoEstudiante;
		
		cantidadEstudiantes++;
	}
	
	public void matricularCurso(Curso curso) {
		curso.agregarEstudiante(this);
		System.out.println(nombre + " se matriculó en " + curso.getNombre());
	}
	
	@Override
	public void mostrarRol() {
		System.out.println("Rol: Estudiante");
	}
	
	public static int getCantidadEstudiantes() {
		return cantidadEstudiantes;
	}
	
	public String getCodigoEstudiante() {
		return codigoEstudiante;
	}
}

