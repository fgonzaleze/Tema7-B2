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
	/**
	 * Atributo privado entero de la hora
	 */
	private int hora;
	
	/**
	 * Atributo privado entero de los minutos
	 */
	private int minuto;

	/**
	 * Atributo privado entero de los segundos
	 */
	private int segundo;
	
	/**
	 * Constructor sin parametros que no devuelve na
	 */
	public Hora() {

	}
	
	/**
	 * Constructor que asigna los valores a los atributos de la clase hora
	 * @param hora recibirá las horas
	 * @param minuto recibirá los minutos
	 * @param segundo recibirá los segundos
	 */
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	/**
	 * Metodo get para el aributo hora
	 * @return devuelve un entero hora
	 */
	public int getHora() {
		return hora;
	}
	
	/**
	 * Méotodo set para la hora, que debe ser entre 0 y 23
	 * @param hora valor entero en horas que introduzca el usuario
	 */
	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
	}
	
	/**
	 * Método get del atributo minuto
	 * @return devuleve un entero en minutos
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Metodo set para los minutos que debe estar entre 0 y 59
	 * @param minuto valor entero en minutos que introduzca el usuario
	 */
	public void setMinuto(int minuto) {
		if (minuto <= 59 || minuto >= 0) {
			this.minuto = minuto;
		}
	}
	
	/**
	 * Método get del atributo segundo
	 * @return devuleve un entero en segundos
	 */
	public int getSegundo() {
		return segundo;
	}
	
	/**
	 * Metodo set para los segundos que debe estar entre 0 y 59
	 * @param segundo valor en segundos que introduce el usuario
	 */
	public void setSegundo(int segundo) {
		if (segundo <= 59 || segundo >= 0) {
			this.segundo = segundo;
		}
	}
	
	/**
	 * Metodo que incrementará los segundos, y en consecuencia, los minutos o las horas
	 * @param incremento parametro que será el introducido para incrementar los segundos
	 */
	public void incrementaSegundos(int incremento) {

		// Creamos un bucle que se ejecute hasta el incremento introducido, una vez por
		// bucle. Vamos aumentando en un segundo. 
		for (int i = 1; i <= incremento; i++) {

			this.segundo++;

			// Si el segundo llega a 59 + 1, aumentaremos los minutos y los segundos irán a 0
			if (this.segundo > 59) {

				this.segundo = 0;
				this.minuto++;

				// Si el min llega a 59 + 1, aumentaremos las horas y los minutos irán a 0
				if (this.minuto > 59) {

					this.minuto = 0;
					this.hora++;

					// En el caso que las horas sean 24, serán 0.
					if (this.hora == 24) {

						this.hora = 0;
					}
				}

			}

		}

	}

	// Metodo para imprimir la hora
	public void muestraHora() {

		System.out.println("Esta es la hora: " + getHora() + ":" + getMinuto() + ":" + getSegundo());

	}

}
