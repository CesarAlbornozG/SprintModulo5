package cl.awakelab.prevencion.controller;

import java.util.List;

import cl.awakelab.prevencion.controller.interfaces.ICapacitacion;
import cl.awakelab.prevencion.model.entity.Capacitacion;
import cl.awakelab.prevencion.services.CapacitacionService;

public class CapacitacionController implements ICapacitacion{
	
	CapacitacionService capacitacionService = new CapacitacionService();
	
	@Override	
	public List<Capacitacion> findAllCapacitaciones() {
		return capacitacionService.findAllCapacitaciones();		
	}

	@Override
	public void registroCapacitacion(Capacitacion capacitacion) {
		capacitacionService.registroCapacitacion(capacitacion);
	}
}
