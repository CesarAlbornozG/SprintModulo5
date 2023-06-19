package cl.awakelab.prevencion.model.entity;

public class Contacto {
	private int id;
	private String nombreCompleto;
	private String email;
	private String asunto;
	private String mensaje;
	
	/**
	 * 
	 */
	public Contacto() {
	}
	
	/**
	 * @param nombreCompleto
	 * @param email
	 * @param asunto
	 * @param mensaje
	 */
	public Contacto(String nombreCompleto, String email, String asunto, String mensaje) {
		this.nombreCompleto = nombreCompleto;
		this.email = email;
		this.asunto = asunto;
		this.mensaje = mensaje;
	}
	
	/**
	 * @param id
	 * @param nombreCompleto
	 * @param email
	 * @param asunto
	 * @param mensaje
	 */
	public Contacto(int id, String nombreCompleto, String email, String asunto, String mensaje) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.email = email;
		this.asunto = asunto;
		this.mensaje = mensaje;
	}

	public int getId() {
		return id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public String getEmail() {
		return email;
	}

	public String getAsunto() {
		return asunto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Contacto [nombreCompleto=" + nombreCompleto + ", email=" + email + ", asunto=" + asunto
				+ ", mensaje=" + mensaje + "]";
	}
	
	
	
	
}
