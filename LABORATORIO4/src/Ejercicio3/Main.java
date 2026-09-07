package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

abstract class Vehiculo {
	public abstract void acelerar();
}

class Coche extends Vehiculo{
	@Override
	public void acelerar() {
		System.out.println("Coche Acelerando - Motor....");
	}
}

class Bicicleta extends Vehiculo{
	@Override
	public void acelerar() {
		System.out.println("Bicicleta acelerando - Pedaleando....");
	}
}


class AceleradorVehiculos{
	
	public void acelerarVehiculo(Vehiculo vehiculo) {
		vehiculo.acelerar();
	}
	
	public void acelerarTodos(List<Vehiculo> vehiculos	) {
		for (Vehiculo v : vehiculos) {
			v.acelerar();
		}
	}

}
public class Main {
	public static void main(String[] args) {
		AceleradorVehiculos acelerador = new AceleradorVehiculos();
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		
		vehiculos.add(new Coche());
		vehiculos.add(new Bicicleta());
		
		acelerador.acelerarTodos(vehiculos);
	}

}
