package Ejercicio2;
import java.util.ArrayList;
import java.util.List;

abstract class Forma {
	public abstract void dibujar();
}

class Circulo extends Forma{
	@Override
	public void dibujar() {
		System.out.println("Dibujando Circulo....");
	}
}

class Rectangulo extends Forma{
	@Override
	public void dibujar() {
		System.out.println("Dibujando Rectangulo....");
	}
}

class Triangulo extends Forma{
	@Override
	public void dibujar() {
		System.out.println("Dibujando Rectangulo....");
	}
}
class EditorFormas{
	public void dibujarForma(Forma forma) {
		forma.dibujar();
	}
	
	public void dibujarTodas(List<Forma> formas	) {
		for (Forma f : formas) {
			f.dibujar();
		}
	}
}

class Main {
	public static void main(String [] args) {
		EditorFormas editor = new EditorFormas();
		
		List<Forma> formas = new ArrayList<>();
		formas.add(new Circulo());
		formas.add(new Rectangulo());
		formas.add(new Triangulo());
		
		editor.dibujarTodas(formas);
		
	}
}




