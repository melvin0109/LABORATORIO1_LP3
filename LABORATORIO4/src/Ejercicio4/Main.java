package Ejercicio4;
import java.util.Scanner;

interface Imprimible{
	public abstract void imprimir();
}

interface Escaneable{
	public abstract void escanear();
}


class Impresora implements Imprimible {
	 @Override
	 public void imprimir() {
		 System.out.println("Imprimiendo");
	 }
}

class ImpresoraMultifuncional implements Imprimible,Escaneable{
	@Override
	public void imprimir() {
		System.out.println("Imprimiendo");
	}
	
	@Override
	public void escanear() {
		System.out.println("Escaneando");
	}
}


public class Main {
	private static void menuAcciones(Object dispositivo, Scanner scanner) {
        int opcionAccion;

        do {
            System.out.println("\n--- ¿Qué desea hacer con el dispositivo? ---");
            System.out.println("1. Imprimir");

            if (dispositivo instanceof Escaneable) {
                System.out.println("2. Escanear");
                System.out.println("3. Volver al menú principal");
            } else {
                System.out.println("2. Volver al menú principal");
            }

            System.out.print("Elija una acción: ");
            opcionAccion = scanner.nextInt();

            if (opcionAccion == 1) {
                ((Imprimible) dispositivo).imprimir();
            } else if (opcionAccion == 2 && dispositivo instanceof Escaneable) {
                ((Escaneable) dispositivo).escanear();
            } else if ((opcionAccion == 2 && !(dispositivo instanceof Escaneable)) || opcionAccion == 3) {
                System.out.println("Volviendo al menú principal...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }

        } while (true);
    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionDispositivo;

        do {
            System.out.println("\n=== SELECCIÓN DE DISPOSITIVO ===");
            System.out.println("1. Crear Impresora Básica");
            System.out.println("2. Crear Impresora Multifuncional");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcionDispositivo = scanner.nextInt();

            switch (opcionDispositivo) {
                case 1:
                    Impresora basica = new Impresora();
                    menuAcciones(basica, scanner);
                    break;
                case 2:
                    ImpresoraMultifuncional multifuncional = new ImpresoraMultifuncional();
                    menuAcciones(multifuncional, scanner);
                    break;
                case 3:
                    System.out.println("¡Saliendo del programa!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcionDispositivo != 3);

        scanner.close();
	}


}

