package ACTIVIDADES;


import java.util.Scanner;

public class Actividad6 {

    static int convertirSegundos(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese las horas: ");
        int horas = entrada.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = entrada.nextInt();

        System.out.print("Ingrese los segundos: ");
        int segundos = entrada.nextInt();

        int resultado = convertirSegundos(horas, minutos, segundos);

        System.out.println("Conversión segundos: " + resultado);
    }
}