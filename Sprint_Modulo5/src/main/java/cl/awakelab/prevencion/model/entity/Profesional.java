package cl.awakelab.prevencion.model.entity;

public class Profesional extends Usuario{
	private int idProfesional;	
	private String titulo;
	private String fechaIngreso;
	
	/**
	 * Constructor Vacio.
	 */
	public Profesional() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param titulo
	 * @param fechaIngreso
	 */
	

	public Profesional(int id, String titulo, String fechaIngreso) {
		super(id);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	
	

	/**
	 * Constructor para update
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param run
	 */
	public Profesional(int id, String nombre, String apellido, String fechaNacimiento, String run,
			String titulo, String fechaIngreso) {
		super(id, nombre, apellido, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param run Rut del Usuario.
	 * @param titulo Titulo de estudios del Profesional.
	 * @param fechaIngreso Fecha de ingreso a la empresa del Profesional.
	 */
	public Profesional(String usuario, String password, String run, String fechaNacimiento, String nombre,
			String apellido, String tipoUsuario, String titulo, String fechaIngreso) {
		super(usuario, password, run, fechaNacimiento, nombre, apellido, tipoUsuario);
		this.titulo=titulo;
		this.fechaIngreso=fechaIngreso;
	}
	
	/**
	 * @param nombre Nombre del Usuario.
	 * @param apellido Apellido del Usuario.
	 * @param fechaDeNacimiento Fecha de Nacimiento del Usuario.
	 * @param run Rut del Usuario.
	 * @param titulo Titulo de estudios del Profesional.
	 * @param fechaIngreso Fecha de ingreso a la empresa del Profesional.
	 */
	public Profesional(int id, String usuario, String password, String run, String fechaNacimiento, String nombre,
			String apellido, String tipoUsuario, int idProfesional, String titulo, String fechaIngreso) {
		super(id, usuario, password, run, fechaNacimiento, nombre, apellido, tipoUsuario);
		this.idProfesional = idProfesional;		
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	
	
	public int getIdProfesional() {
		return idProfesional;
	}

	public String getTitulo() {
		return titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
}
