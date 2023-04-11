package ejercicio02;

public class Main {

	public static void main(String[] args) {
		
		// Introducimos el valor inicial en el contador
		Contador contador=new Contador(3);
		
		// Llamamos para incrementar
		contador.incrementar();
		
		// O para decrementar
		contador.decrementar();
		contador.decrementar();
		
		// El resultado es 2 porque incrementamos 3 + 1 - 2
		System.out.println("Incrementado " + contador.getContador());
	}

}
