package cl.awakelab.prevencion.controller;

import java.util.List;

import cl.awakelab.prevencion.model.entity.Administrativo;
import cl.awakelab.prevencion.services.AdministrativoService;

public class AdministrativoController extends UsuarioController{
	
	AdministrativoService administrativoService = new AdministrativoService();
	
	public void registroAdministrativo(Administrativo administrativo) {
		administrativoService.registroAdministrativo(administrativo);		
	}
	
	public void updateAdministrativo(Administrativo administrativo) {
	    administrativoService.updateAdministrativo(administrativo);
	}	
	
	public List<Administrativo> findAllAdministrativos() {
		return administrativoService.findAllAdministrativos();
	}
	public Administrativo findByIdAdministrativo(int idUsuario) {
		return administrativoService.findByIdAdministrativo(idUsuario);
	}	
}
