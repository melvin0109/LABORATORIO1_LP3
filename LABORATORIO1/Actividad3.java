package ACTIVIDADES;

public class Actividad3 {

    public static void main(String[] args) {

        int[] frecuencia = new int[6];

        for (int i = 0; i < 20000; i++) {

            int dado = (int)(Math.random() * 6) + 1;

            frecuencia[dado - 1]++;
        }

        for (int i = 0; i < frecuencia.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + frecuencia[i]);
        }
    }
}
