package cl.awakelab.prevencion.model.entity;

public class Capacitacion {
	private int identificador;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadDeAsistentes;
	
	
	
	/** 
	 * Constructor Vacio.
	 * */
	public Capacitacion() {
		
	}
	
	
	/**

	 * @param identificador Número de identificador de la capacitación.
	 * @param rut Rut del clinte de la capacitación.
	 * @param dia Día de la capacitación.
	 * @param hora Hora de la capacitación.
	 * @param lugar Lugar de la capacitación.
	 * @param duracion Duración de la capacitación.
	 * @param cantidadDeAsistentes Cantidad de asistentes de la capacitación.
	 */
	public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadDeAsistentes) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}


	/**
	 * @param identificador Número de identificador de la capacitación.
	 * @param rutCliente Rut del clinte de la capacitación.
	 * @param dia Día de la capacitación.
	 * @param hora Hora de la capacitación.
	 * @param lugar Lugar de la capacitación.
	 * @param duracion Duración de la capacitación.
	 * @param cantidadDeAsistentes Cantidad de asistentes de la capacitación.
	 */
	public Capacitacion(String rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadDeAsistentes) {

		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}
	public int getIdentificador() {
		return identificador;
	}
	public String getRutCliente() {
		return rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public String getHora() {
		return hora;
	}
	public String getLugar() {
		return lugar;
	}
	public String getDuracion() {
		return duracion;
	}
	public int getCantidadDeAsistentes() {
		return cantidadDeAsistentes;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}
	
	
	public String toString() {
		return "Capacitacion [rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes="
				+ cantidadDeAsistentes + "]";
	}	
	
}
