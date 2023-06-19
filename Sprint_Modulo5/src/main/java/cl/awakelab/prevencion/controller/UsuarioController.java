package cl.awakelab.prevencion.controller;

import java.util.ArrayList;
import java.util.List;

import cl.awakelab.prevencion.controller.interfaces.IUsuario;
import cl.awakelab.prevencion.model.entity.Administrativo;
import cl.awakelab.prevencion.model.entity.Cliente;
import cl.awakelab.prevencion.model.entity.Profesional;
import cl.awakelab.prevencion.model.entity.Usuario;
import cl.awakelab.prevencion.services.AdministrativoService;
import cl.awakelab.prevencion.services.ClienteService;
import cl.awakelab.prevencion.services.ProfesionalService;
import cl.awakelab.prevencion.services.UsuarioService;


public class UsuarioController implements IUsuario{
	
	UsuarioService usuarioService = new UsuarioService();
	ClienteService clienteService = new ClienteService();
	ProfesionalService profesionalService = new ProfesionalService();
	AdministrativoService administrativoService = new AdministrativoService();
	
	@Override
	public List<Usuario> findAllUsuarios() {		
		return usuarioService.findAllUsuarios();		
	}
	
	@Override
	public void registroUsuario(Usuario user) {
		usuarioService.registroUsuario(user);		
	}
	
	@Override
	public int findIdByRunUsuario(String run) {		    
	   return usuarioService.findIdByRunUsuario(run);
	 }

	@Override
	public List<Usuario> listarUsuariosPorTipo(String tipoUsuario) {
		
		List<Usuario> usuarios = new ArrayList<>();
		
		if(tipoUsuario == "Cliente") {
			clienteService.findAllClientes();
			
		}else if(tipoUsuario == "Profesional"){
			profesionalService.findAllProfesionales();
			
		}else if(tipoUsuario == "Administrativo") {
			administrativoService.findAllAdministrativos();		
		}
		
		return usuarios;
	}

	@Override
	public void registroCliente(Cliente cliente) {
		clienteService.registroCliente(cliente);	
	}

	@Override
	public void registroProfesional(Profesional profesional) {
		profesionalService.registroProfesional(profesional);		
	}

	@Override
	public void registroAdministrativo(Administrativo administrativo) {
		administrativoService.registroAdministrativo(administrativo);		
	}

}
