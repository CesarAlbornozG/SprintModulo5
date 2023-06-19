package cl.awakelab.prevencion.controller;

import java.util.List;

import cl.awakelab.prevencion.model.entity.Cliente;
import cl.awakelab.prevencion.services.ClienteService;

public class ClienteController extends UsuarioController {

	ClienteService clienteService = new ClienteService();

	public void registroCliente(Cliente cliente) {
		clienteService.registroCliente(cliente);
	}

	public void updateCliente(Cliente cliente) {
		clienteService.updateCliente(cliente);
	}

	public List<Cliente> findAllClientes() {
		return clienteService.findAllClientes();
	}

	public Cliente findByIdCliente(int idUsuario) {	    
		return clienteService.findByIdCliente(idUsuario);
	
}
}
