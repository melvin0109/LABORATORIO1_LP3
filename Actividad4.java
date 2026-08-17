package ACTIVIDADES;

import java.util.Scanner;

public class Actividad4 {

    static double menor(double num1, double num2, double num3) {
        double menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        return menor;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        double num3 = entrada.nextDouble();

        System.out.println("El menor es: " + menor(num1, num2, num3));
    }
}