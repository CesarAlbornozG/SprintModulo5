package cl.awakelab.prevencion.controller.interfaces;

import java.util.List;

import cl.awakelab.prevencion.model.entity.Administrativo;
import cl.awakelab.prevencion.model.entity.Cliente;
import cl.awakelab.prevencion.model.entity.Profesional;
import cl.awakelab.prevencion.model.entity.Usuario;

public interface IUsuario {
	
	public List<Usuario> findAllUsuarios();
	
	void registroUsuario(Usuario usuario);
	
	void registroCliente(Cliente cliente);
	
	void registroProfesional(Profesional profesional);
	
	void registroAdministrativo(Administrativo administrativo);
	
	
	List<Usuario> listarUsuariosPorTipo(String tipoUsuario);
	
	public int findIdByRunUsuario(String run);
	
}

