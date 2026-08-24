package ejercicios;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static GestionSistema sistema = new GestionSistema();

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("\n------SISTEMA DE GESTIÓN DE CURSOS --------");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar profesor");
            System.out.println("3. Registrar curso");
            System.out.println("4. Asignar profesor a curso");
            System.out.println("5. Matricular estudiante");
            System.out.println("6. Mostrar estudiantes");
            System.out.println("7. Mostrar profesores");
            System.out.println("8. Mostrar cursos");
            System.out.println("9. Mostrar cantidades");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    registrarEstudiante();
                    break;

                case 2:
                    registrarProfesor();
                    break;

                case 3:
                    registrarCurso();
                    break;

                case 4:
                    asignarProfesor();
                    break;

                case 5:
                    matricularEstudiante();
                    break;

                case 6:
                    sistema.mostrarEstudiantes();
                    break;

                case 7:
                    sistema.mostrarProfesores();
                    break;

                case 8:
                    sistema.mostrarCursos();
                    break;

                case 9:
                    mostrarCantidades();
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    public static void registrarEstudiante() {

        System.out.println("\n===== REGISTRAR ESTUDIANTE =====");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        System.out.print("Código del estudiante: ");
        String codigo = scanner.nextLine();

        Estudiante estudiante = new Estudiante(
                nombre,
                dni,
                correo,
                codigo
        );

        sistema.agregarEstudiante(estudiante);

        System.out.println("Estudiante registrado correctamente.");
    }

    public static void registrarProfesor() {

        System.out.println("\n===== REGISTRAR PROFESOR =====");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        System.out.print("Especialidad: ");
        String especialidad = scanner.nextLine();

        Profesor profesor = new Profesor(
                nombre,
                dni,
                correo,
                especialidad
        );

        sistema.agregarProfesor(profesor);

        System.out.println("Profesor registrado correctamente.");
    }

    public static void registrarCurso() {

        System.out.println("\n===== REGISTRAR CURSO =====");

        System.out.print("Código del curso: ");
        String codigo = scanner.nextLine();

        System.out.print("Nombre del curso: ");
        String nombre = scanner.nextLine();

        System.out.print("Categoría: ");
        String nombreCategoria = scanner.nextLine();

        Categoria categoria = new Categoria(nombreCategoria);

        Curso curso = new Curso(
                codigo,
                nombre,
                categoria
        );

        sistema.agregarCurso(curso);

        System.out.println("Curso registrado correctamente.");
    }

    public static void asignarProfesor() {

        System.out.println("\n===== ASIGNAR PROFESOR =====");

        sistema.mostrarProfesores();

        System.out.print("\nIngrese el nombre del profesor: ");
        String nombreProfesor = scanner.nextLine();

        sistema.mostrarCursos();

        System.out.print("\nIngrese el código del curso: ");
        String codigoCurso = scanner.nextLine();

        Profesor profesor = sistema.buscarProfesor(nombreProfesor);
        Curso curso = sistema.buscarCurso(codigoCurso);

        if (profesor != null && curso != null) {

            profesor.asignarCurso(curso);

        } else {

            System.out.println(
                    "No se encontró el profesor o el curso."
            );
        }
    }


    public static void matricularEstudiante() {

        System.out.println("\n===== MATRICULAR ESTUDIANTE =====");

        sistema.mostrarEstudiantes();

        System.out.print("\nIngrese el código del estudiante: ");
        String codigoEstudiante = scanner.nextLine();

        sistema.mostrarCursos();

        System.out.print("\nIngrese el código del curso: ");
        String codigoCurso = scanner.nextLine();

        Estudiante estudiante =
                sistema.buscarEstudiante(codigoEstudiante);

        Curso curso =
                sistema.buscarCurso(codigoCurso);

        if (estudiante != null && curso != null) {

            estudiante.matricularCurso(curso);

        } else {

            System.out.println(
                    "No se encontró el estudiante o el curso."
            );
        }
    }

    public static void mostrarCantidades() {

        System.out.println("\n===== CANTIDADES =====");

        System.out.println(
                "Total de estudiantes: "
                        + Estudiante.getCantidadEstudiantes()
        );

        System.out.println(
                "Total de profesores: "
                        + Profesor.getCantidadProfesores()
        );
    }
}