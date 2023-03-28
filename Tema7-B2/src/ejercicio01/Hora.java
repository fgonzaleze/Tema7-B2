package ejercicio01;

/*
 * Diseñar la clase Hora, que dispone de los atributos hora, minuto y segundo. Además
Añade los siguientes constructores:
 - Constructor sin parámetros.
 - Constructor con todos los parámetros.
 Se accederán a ellos a través de métodos get/set. 
Añade también el método incrementaSegundo que incrementa un segundo a la hora actual.
Prueba esta clase de forma que en el main se pida la cantidad de segundos a incrementar 
y muestre por pantalla el resultado de incrementar esos segundos.
 */

public class Hora {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora() {
		
	}
	
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Hora(Hora h) {
		this.hora = h.hora;
		this.minuto = h.minuto;
		this.segundo = h.segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora>=0 && hora <=23) {
			this.hora = hora;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	

}
