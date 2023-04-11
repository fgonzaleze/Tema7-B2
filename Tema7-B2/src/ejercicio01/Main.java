package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Escaner de siempre
										
		Scanner sc= new Scanner (System.in); 
		
		
		int hora;
		int min;
		int seg;
		
		//Creamos el objeto.
		Hora incrementarSeg = new Hora();
										
		
		// Vamos pidiendo los 								
		System.out.print("Introduzca la hora: ");
		hora= sc.nextInt();
		System.out.print("Introduzca los minutos: ");
		min= sc.nextInt();
		System.out.print("Introduzca los segundos: ");
		seg= sc.nextInt();
		
		//Pasamos los valores de las variables a la clase de las funciones.
		incrementarSeg.setHora(hora);
		incrementarSeg.setMinuto(min);
		incrementarSeg.setSegundo(seg);
		
		incrementarSeg.muestraHora();
		
		// Pedimos los seg que vamos a incrementar
		System.out.print("Introduzca los segundos que quiera incrementar: ");
		int incremento= sc.nextInt();
		
		incrementarSeg.incrementaSegundos(incremento);
		
		incrementarSeg.muestraHora();

		sc.close();

	}

}
