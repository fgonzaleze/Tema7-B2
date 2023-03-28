package ejercicio04;

public class Disco {
	/**
	 * Codigo para comprobar los discos guardados en el array
	 */
	private String codigo = "LIBRE";
	/**
	 * Autor del disco
	 */
	private String autor = "";
	/**
	 * Titulo del disco
	 */
	private String titulo = "";
	/**
	 * Género del disco
	 */
	private String genero = "";
	/**
	 * Duracion del disco
	 */
	private int duracion = 0;
	
	/**
	 * Constructor Disco vacío
	 */
	public Disco() {

	}
	
	/**
	 * Constructor Disco con parametros
	 * @param codigo 
	 * @param autor Autor del disco
	 * @param titulo titulo  del disco
	 * @param genero genero del disco
	 * @param duracion duracion del disco
	 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}

	/**
	 * Constructor copia de los valores de otro objeto del mismo tipo
	 * @param d Objeto de tipo Disco del cual voy a copiar los valores
	 */
	public Disco(Disco d) {
		this.codigo = d.codigo;
		this.autor = d.autor;
		this.titulo = d.titulo;
		this.genero = d.genero;
		this.duracion = d.duracion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}

	/**
	 * El método toString me devuelve una cadena con una representación de los
	 * valores de los atributos.
	 */
	public String toString() {
		String result = "";
		result += "Código: " + this.codigo + "\n";
		result += "Autor: " + this.autor + "\n";
		result += "Título: " + this.titulo + "\n";
		result += "Género: " + this.genero + "\n";
		result += "Duración: " + this.duracion + "\n";
		return result;
	}

}
