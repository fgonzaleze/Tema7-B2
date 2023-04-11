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
	private int ano;

	// Constructor por defecto
	public Fecha() {
	}

	// Constructor con parámetros
	public Fecha(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Declaramos los getter y setter
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		// Solo tiene sentido si el dia esta entre 1 y 31
		if (dia >= 1 && dia <= 31) { 
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		// Solo tiene sentido si el mes esta entre 1 y 12
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Método que indicará si el año del objeto Fecha es bisiesto o no
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
				} else if (dia == 29 && esBisiesto(this.ano)) {
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
			// Para el 31 de dic, sumamos un año
			if (this.dia == 31 && this.mes == 12) {
				setDia(1);
				setMes(1);
				this.ano++;
				// si el día es 31 y el mes tiene 31 días
			} else if (this.dia == 31 && (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7
					|| this.mes == 8 || this.mes == 10 || this.mes == 12)) {
				setDia(1);
				this.mes++;
				// Si el dia es 30 y el mes tiene 30 dias
			} else if (this.dia == 30 && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
				setDia(1);
				this.mes++;
				// si el mes es febrero y el año no es bisiesto (28)
			} else if (this.dia == 28 && this.mes == 2 && !esBisiesto(this.ano)) {
				setDia(1);
				this.mes++;
				//Si el mes es febrero y el año es bisiesto (29)
			} else if (this.dia == 29 && this.mes == 2 && esBisiesto(this.ano)) {
				setDia(1);
				this.mes++;
				// Para todo lo demás, un diita mas
			} else {
				this.dia++;
			}
		}
	

	/**
	 * Método que mostrará la fecha en formato dd-mm-aaa
	 * @return fecha en formato dd-mm-aaaa
	 */

	public String toString() {

		String fecha = dia + "-" + mes + "-" + ano;

		// en caso que el dia sea menor que 10
		if (dia < 10) {
			fecha = "0" + dia + "-" + mes + "-" + ano;
		}
		// en caso que el mes sea menor de 10
		if (mes < 10) {
			fecha = dia + "-0" + mes + "-" + ano;
		}
		return fecha;
	}

}
