package cl.awakelab.prevencion.controller;

import java.util.List;

import cl.awakelab.prevencion.model.entity.Profesional;
import cl.awakelab.prevencion.services.ProfesionalService;

public class ProfesionalController extends UsuarioController{
	
	ProfesionalService profesionalService = new ProfesionalService();
		
	public void registroProfesional(Profesional profesional) {
		profesionalService.registroProfesional(profesional);
	}
	
	 public Profesional findByIdProfesional(int idUsuario) {	    
		    return profesionalService.findByIdProfesional(idUsuario);
	}		  
		  
	public void updateProfesional(Profesional profesional) {
		profesionalService.updateProfesional(profesional);
	}		  

	public List<Profesional> findAllProfesionales() {		
		return profesionalService.findAllProfesionales();
	}
	
}
