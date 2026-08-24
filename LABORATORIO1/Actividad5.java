package ACTIVIDADES;

import java.util.Scanner;

public class Actividad5 {

    static double calcularCargo(int horas) {

        double cargo;

        if (horas <= 0) {
            cargo = 0;
        } 
        else {
            cargo = 3.00 + (horas - 1) * 0.50;
        }

        if (cargo > 12.00) {
            cargo = 12.00;
        }

        return cargo;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de horas: ");
        int horas = entrada.nextInt();

        System.out.println("Cargo: S/ " + calcularCargo(horas));
    }
}
