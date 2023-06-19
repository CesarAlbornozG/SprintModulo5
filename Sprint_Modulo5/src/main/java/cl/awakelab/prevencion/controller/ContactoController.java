package cl.awakelab.prevencion.controller;

import java.util.List;

import cl.awakelab.prevencion.controller.interfaces.IContacto;
import cl.awakelab.prevencion.model.entity.Contacto;
import cl.awakelab.prevencion.services.ContactoService;

public class ContactoController implements IContacto{

	ContactoService contactoService = new ContactoService();
	
	@Override
	public void registroContacto(Contacto contacto) {		
		contactoService.registroContacto(contacto);
	}	
	
	@Override
	public List<Contacto> findAllContactos() {
		return contactoService.findAllContactos();
	}

}
