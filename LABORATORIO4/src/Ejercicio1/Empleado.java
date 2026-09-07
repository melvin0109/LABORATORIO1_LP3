package Ejercicio1;
import java.util.Scanner;

public class Empleado {
	String nombre;
	double salario = 0.0;
	int departamento;
	
	Empleado(String nombre,int departamento){
		this.nombre = nombre;
		this.salario = 0;
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	
	
}

class CalculoPago {
	
	public double calcularPago(int horasTrabajadas, Empleado empleado) {
		double pago = horasTrabajadas * 5;
		empleado.setSalario(pago);
		
		return pago;
			
	}
}

class Main {
	
	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese el nombre del empleado: ");
			String nombre = scanner.nextLine();
			
			System.out.println("Ingrese el departamento del empleado: ");
			int departamento = scanner.nextInt();
			
			System.out.println("Ingrese las horas trabajadas por el empleado: ");
			int horas = scanner.nextInt();
			
			Empleado e1 = new Empleado(nombre,departamento);
			
			CalculoPago calculo = new CalculoPago();
			
			double calculadora = calculo.calcularPago(horas,e1);
			
			System.out.print("El salario de " + e1.getNombre() + " es: S/." + calculadora); 
			
			scanner.close();
}
	
}

