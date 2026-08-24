package ejercicios;
import java.util.ArrayList;

public class GestionSistema {
	
	private ArrayList<Estudiante> estudiantes;
	private ArrayList<Profesor> profesores;
	private ArrayList<Curso> cursos;
	
	public GestionSistema() {
		estudiantes = new ArrayList<>();
		profesores = new ArrayList<>();
		cursos = new ArrayList<>();
	}
	
	public void agregarEstudiante(Estudiante estudiante) {
		
		estudiantes.add(estudiante);
	}
	
	public void agregarProfesor(Profesor profesor) {
		
		profesores.add(profesor);
		
	}
	
	public void agregarCurso(Curso curso) {
		
		cursos.add(curso);
	}
	
	public Estudiante buscarEstudiante(String codigo) {
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.getCodigoEstudiante().equalsIgnoreCase(codigo)) {
				return estudiante;
			}
		}
		
		return null;
	}
	
	
	 public Profesor buscarProfesor(String nombre) {

	    for (Profesor profesor : profesores) {
	        if (profesor.getNombre().equalsIgnoreCase(nombre)) {
	             return profesor;
	         }
	    }
	    
	    return null;
	}
	
	public Curso buscarCurso(String codigo) {
		for (Curso curso : cursos) {
			if (curso.getCodigo().equalsIgnoreCase(codigo)) {
				return curso;
			}
		}
		return null;
	}
	
	public void mostrarEstudiantes() {
		System.out.println("\n ---------- Estudiantes ------------\n");
		if (estudiantes.isEmpty()) {
			System.out.println("No hay estudiantes registrados");
			
			return;
		}
		
		for (Estudiante estudiante : estudiantes) {
			
			System.out.println(
			"Código: " + estudiante.getCodigoEstudiante()
			+ " | Nombre: " + estudiante.getNombre()
            + " | DNI: " + estudiante.getDni()
            + " | Correo: " + estudiante.getCorreo()
            );
		}
	}
	
	public void mostrarProfesores() {
		System.out.println("\n-------------PROFESORES-----------\n");
		
		 if (profesores.isEmpty()) {
			 
	        System.out.println("No hay profesores registrados.");
	        return;
	        }

	     for (Profesor profesor : profesores) {

	         System.out.println(
	         "Nombre: " + profesor.getNombre()
	         + " | DNI: " + profesor.getDni()
	         + " | Correo: " + profesor.getCorreo()
	         + " | Especialidad: " + profesor.getEspecialidad()
	         );
	        }
	    }
	
	public void mostrarCursos() {

        System.out.println("\n---------CURSOS---------");
        
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        
        for (Curso curso : cursos) {
            curso.mostrarInformacion();
        }
    }
	
	public void mostrarCursosDisponibles() {

        System.out.println("\n---------CURSOS DISPONIBLES----------");

        boolean hayCursos = false;

        for (Curso curso : cursos) {
            if (curso.estaDisponible()) {
                curso.mostrarInformacion();
                hayCursos = true;
            }
        }

        if (!hayCursos) {
            System.out.println("No hay cursos disponibles.");
        }
    }
	
	public int cantidadEstudiantes() {
		return estudiantes.size();
	}
	
	public int cantidadProfesores() {
		return profesores.size();
	}
	
	public int cantidadCursos() {
		return cursos.size();
	}
}
	

