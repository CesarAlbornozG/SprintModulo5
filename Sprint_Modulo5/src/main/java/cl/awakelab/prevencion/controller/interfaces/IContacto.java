package cl.awakelab.prevencion.controller.interfaces;

import java.util.List;

import cl.awakelab.prevencion.model.entity.Contacto;

public interface IContacto {
	
	void registroContacto(Contacto contacto);
	public List<Contacto> findAllContactos();
}
