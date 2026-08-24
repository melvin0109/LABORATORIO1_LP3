package ACTIVIDADES;
import java.util.Scanner;

public class Actividad2 {

    static void mostrarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void main(String[] args) {

        int[] numeros = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Numero: ");
            int numero = entrada.nextInt();

            while (i > 0 && numero <= numeros[i - 1]) {
                System.out.println("El numero debe ser mayor que " + numeros[i - 1]);
                System.out.print("Otro numero: ");
                numero = entrada.nextInt();
            }

            numeros[i] = numero;
        }

        mostrarNumeros(numeros);
    }
}
