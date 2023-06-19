package cl.awakelab.prevencion.controller.interfaces;

import java.util.List;

import cl.awakelab.prevencion.model.entity.Capacitacion;

public interface ICapacitacion {
	
	public List<Capacitacion> findAllCapacitaciones();
	public void registroCapacitacion(Capacitacion capacitacion);
}
