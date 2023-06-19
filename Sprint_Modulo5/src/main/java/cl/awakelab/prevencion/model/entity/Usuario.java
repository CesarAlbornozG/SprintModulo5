package cl.awakelab.prevencion.model.entity;

public class Usuario {
	
	private int id;
	private String usuario;
	private String password;
	private String run;
	private String fechaNacimiento;
	private String nombre;
	private String apellido;
	private String tipoUsuario;
	
	/**
	 * Constructor Vacio.
	 */
	public Usuario() {

	}


	/**
	 * @param id
	 */
	public Usuario(int id) {
	
		this.id = id;
	}
	
	/**
	 * Constructor para update
	 * @param id
	 * @param run
	 * @param fechaNacimiento
	 * @param nombre
	 * @param apellido
	 */
	public Usuario(int id, String nombre, String apellido, String fechaNacimiento, String run) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}


	/**	 
	 * @param usuario Username de usuario.
	 * @param password Password de usuario.
	 * @param run Rut del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 */
	public Usuario(String usuario, String password, String run, String fechaNacimiento, String nombre,
			String apellido, String tipoUsuario) {		
		this.usuario = usuario;
		this.password = password;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoUsuario = tipoUsuario;
	}
	
	/**
	 * @param id Número identificador de usuario.
	 * @param usuario Username de usuario.
	 * @param password Password de usuario.
	 * @param run Rut del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 */
	public Usuario(int id, String usuario, String password, String run, String fechaNacimiento, String nombre,
			String apellido, String tipoUsuario) {
		
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoUsuario = tipoUsuario;
	}


	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getRun() {
		return run;
	}

	public String getPassword() {
		return password;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

	public String getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", run=" + run + ", password=" + password
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	public int buscarIdByRun(String run) {
		Usuario usuario = new Usuario();
		int idUsuario = 0 ;
		idUsuario = usuario.getId();
		return idUsuario;
	}
}
