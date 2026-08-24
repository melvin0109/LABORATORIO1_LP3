package ejercicios;
import java.util.ArrayList;

public class Curso {
	public static final int capacidadMaxima =  30;
	
	private String codigo;
	private String nombre;
	private Categoria categoria;
	private Profesor profesor;
	private ArrayList<Estudiante> estudiantes;
	
	public Curso(String codigo,String nombre, Categoria categoria) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		
		estudiantes = new ArrayList<>();
	}
	
	public boolean agregarEstudiante(Estudiante estudiante) {
		if (estudiantes.size() < capacidadMaxima) {
			estudiantes.add(estudiante);
			return true;
		} else { 
			System.out.println("El curso " + nombre + " esta lleno.");
			
			return false;
		}
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public int cantidadEstudiantes() {
		return estudiantes.size();
	}
	
	public boolean estaDisponible() {
		return estudiantes.size() < capacidadMaxima;
	}
	
	public void mostrarInformacion() {
		System.out.println("\n --------- CURSO ----------\n");
		System.out.println("Código: " + codigo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Categoria:" + categoria.getNombre());
		
		if (profesor != null) {
			System.out.println("Profesor: " + profesor.getNombre());
		} else {
			System.out.println("Profesor: Sin asignar");
		}
		
		System.out.println("Estudiantes matriculados: " + estudiantes.size());
		
		System.out.println("Cupos Disponibles: " +  (capacidadMaxima - estudiantes.size()));
		
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Profesor getProfesor() {
		return profesor;
	}
	
	
}
