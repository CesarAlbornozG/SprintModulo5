package cl.awakelab.prevencion.model.entity;

public class Cliente extends Usuario{
	private int idCliente;
	private int telefono;
	private String afp;
	private String sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	/**
	 * Constructor Vacio.
	 */
	public Cliente() {
		super();
	}

	

	/**
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param run Rut del Usuario.
	 * @param telefono Teléfono del Cliente.
	 * @param afp Afp del Cliente.
	 * @param sistemSalud Sistema de salud del Cliente.
	 * @param direccion Dirección del Cliente.
	 * @param comuna Comuna donde vive el Cliente.
	 * @param edad Edad del Cliente.
	 */
	public Cliente( String usuario, String password, String run, String fechaNacimiento, String nombre,
			String apellido, String tipoUsuario, int telefono, String afp, String sistemaSalud, String direccion,
			String comuna, int edad) {
		super(usuario, password, run, fechaNacimiento, nombre, apellido,tipoUsuario);
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	/**
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param run Rut del Usuario.
	 * @param telefono Teléfono del Cliente.
	 * @param afp Afp del Cliente.
	 * @param sistemSalud Sistema de salud del Cliente.
	 * @param direccion Dirección del Cliente.
	 * @param comuna Comuna donde vive el Cliente.
	 * @param edad Edad del Cliente.
	 */
	public Cliente(int id, String usuario, String password, String run, String fechaNacimiento, String nombre,
			String apellido, String tipoUsuario, int idCliente, int telefono, String afp, String sistemaSalud, String direccion,
			String comuna, int edad) {
		super(id, usuario, password, run, fechaNacimiento, nombre, apellido, tipoUsuario);
		this.idCliente = idCliente;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	
	
	
	/**
	 *  Constructor para update
	 * @param id
	 * @param usuario
	 * @param password
	 * @param run
	 * @param fechaNacimiento
	 * @param nombre
	 * @param apellido
	 * @param tipoUsuario
	 */
	public Cliente(int id, String nombre, String apellido, String fechaNacimiento,
			String run, int telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {
		super(id, nombre, apellido,fechaNacimiento, run);
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}



	public Cliente(int id, int telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {
		super(id);
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
		
	@Override
	public String toString() {
		return "Cliente [telefono=" + telefono + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion="
				+ direccion + ", comuna=" + comuna + ", edad=" + edad + "]";
	}
	
	
	public int getIdCliente() {
		return idCliente;
	}	

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
