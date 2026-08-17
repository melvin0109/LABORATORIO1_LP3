package ACTIVIDADES;
import java.util.Scanner;
import java.util.ArrayList;
public class Actividad1 {

    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        
        
        System.out.print("Cantidad de numeros: ");
        int opcion = entrada.nextInt();

        for (int i = 0;i <opcion; i++) {
        	System.out.print("Numero:");
        	double numero = entrada.nextDouble();
        	
        	numeros.add(numero);
        	
        	
        }
        double suma = 0;
        
        for (double numero : numeros) {
        	suma += numero;
        	
        }
        
        System.out.println("La suma es:" + suma);
        
    }

    
}