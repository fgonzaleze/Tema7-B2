package ejercicio03;

public class Fecha {

	/**
	 * Atributo para guardar el día
	 */
	private int dia;
	/**
	 * Atributo para guardar el mes
	 */
	private int mes;
	/**
	 * Atributo donde guardaremos el año del objeto fecha
	 */
	private int anyo;

	// Constructor por defecto
	public Fecha() {
	}

	// Constructor con parámetros
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	// Declaramos los getter y setter
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	/**
	 * Método que indicará si el año del objeto Fecha es bisiesto o no
	 * 
	 * @return true si es bisiesto y false si no
	 */
	public boolean esBisiesto(int year) {
		boolean esBisiesto = false;

		// Si el año es divisible entre 4 y no es divisible entre 100 o es divisible
		// entre 400, es bisiesto.
		if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			esBisiesto = true;
		}

		return esBisiesto;
	}

	/**
	 * Método que comprobará si la fecha es correcta comprobando los meses y los
	 * días
	 * 
	 * @return true si la fecha es correcta y false si no lo es.
	 */
	public boolean fechaCorrecta() {
		boolean fechaCorrecta = false;

		if (dia >= 1 && dia <= 31) {
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				fechaCorrecta = true;
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia <= 30) {
					fechaCorrecta = true;
				}
			} else if (mes == 2) { // para febrero febrero
				if (dia <= 28) {
					fechaCorrecta = true;
				} else if (dia == 29 && esBisiesto(this.anyo)) {
					fechaCorrecta = true;
				}
			}
		}
		return fechaCorrecta;
	}

	/**
	 * Método que cambia la fecha al día siguiente 
	 * @param fecha Objeto Fecha que vamos a crear
	 */

	public void diaSiguiente(Fecha fecha) {
		if (fecha.fechaCorrecta()) {
			if (this.dia == 31 && this.mes == 12) {
				setDia(1);
				setMes(1);
				this.anyo++;
			} else if (this.dia == 31 && (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7
					|| this.mes == 8 || this.mes == 10 || this.mes == 12)) {
				setDia(1);
				this.mes++;
			} else if (this.dia == 30 && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
				setDia(1);
				this.mes++;
			} else if (this.dia == 28 && this.mes == 2 && !esBisiesto(this.anyo)) {
				setDia(1);
				this.mes++;
			} else if (this.dia == 29 && this.mes == 2 && esBisiesto(this.anyo)) {
				setDia(1);
				this.mes++;
			} else {
				this.dia++;
			}
		}
	}

	/**
	 * Método que mostrará la fecha en formato dd-mm-aaa
	 * 
	 * @return fecha en formato dd-mm-aaaa
	 */

	public String toString() {

		String fecha = dia + "-" + mes + "-" + anyo;

		// en caso que el dia sea menor que 10
		if (dia < 10) {
			fecha = "0" + dia + "-" + mes + "-" + anyo;
		}
		// en caso que el mes sea menor de 10
		if (mes < 10) {
			fecha = dia + "-0" + mes + "-" + anyo;
		}

		return fecha;
	}

}
