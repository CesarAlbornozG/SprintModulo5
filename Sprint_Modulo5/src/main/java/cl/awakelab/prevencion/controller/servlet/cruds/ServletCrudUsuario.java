package cl.awakelab.prevencion.controller.servlet.cruds;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.prevencion.controller.AdministrativoController;
import cl.awakelab.prevencion.controller.ClienteController;
import cl.awakelab.prevencion.controller.ProfesionalController;
import cl.awakelab.prevencion.controller.UsuarioController;
import cl.awakelab.prevencion.model.entity.Administrativo;
import cl.awakelab.prevencion.model.entity.Cliente;
import cl.awakelab.prevencion.model.entity.Profesional;
import cl.awakelab.prevencion.model.entity.Usuario;

/**
 * Servlet implementation class ServletCrudUsuario
 */
@WebServlet("/ServletCrudUsuario")
public class ServletCrudUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String opcion = request.getParameter("opcion");
		String tipo_usuario = request.getParameter("tipoUsuario");
		UsuarioController usuarioController = new UsuarioController();
		ClienteController clienteController = new ClienteController();
		ProfesionalController profesionalController = new ProfesionalController();
		AdministrativoController administrativoController = new AdministrativoController();
		String url = "index.jsp";
		//Switch Case que controla lo que se hará
		switch (opcion) {
		
		case "crearUsuario": {
			String usuario = request.getParameter("usuario");
			String password = request.getParameter("password");
			String createRun = request.getParameter("run");
			String createFechaNacimiento = request.getParameter("fechaNacimiento");
			String createNombre = request.getParameter("nombre");
			String createApellido = request.getParameter("apellido");
			String createTipoUsuario = request.getParameter("tipoUsuario");
			// Instancia de usuario para crear nuevo usuario por el metodo del controlador
			// de usuario (usuarioController.registrousuario() ).
			Usuario newUsuario = new Usuario(usuario, password, createRun, createFechaNacimiento, createNombre, createApellido, createTipoUsuario);
			usuarioController.registroUsuario(newUsuario);
			// variable para guardar el id del usuario por el run, por medio de un metodo de
			// del controlador de usuario.
			// Esto servira para unir la futura instacia de tipo de usuario al usuario
			// recien Instanciado
			int idUsuario = usuarioController.findIdByRunUsuario(newUsuario.getRun());

			// Switch Case (interno) para crear una instancia dependiendo del tipo de usuario asignado
			// al nuevo usuario 
			switch (createTipoUsuario) {
			
			case "Cliente": {
				int telefono = Integer.parseInt(request.getParameter("telefono"));
				String createAfp = request.getParameter("afp");
				String createSistemaSalud = request.getParameter("sistemaSalud");
				String createDireccion = request.getParameter("direccion");
				String createComuna = request.getParameter("comuna");
				int createEdad = Integer.parseInt(request.getParameter("edad"));
				Cliente newCliente = new Cliente(idUsuario, telefono, createAfp, createSistemaSalud, createDireccion, createComuna, createEdad);
				usuarioController.registroCliente(newCliente);
				break;
			}
			case "Profesional": {
				String createTitle = request.getParameter("titulo");
				String createFechaIngreso = request.getParameter("fechaIngreso");
				Profesional newProfesional = new Profesional(idUsuario, createTitle, createFechaIngreso);
				usuarioController.registroProfesional(newProfesional);
				break;
			}
			case "Administrativo": {
				String createArea = request.getParameter("area");
				String createExperienciaPrevia = request.getParameter("experienciaPrevia");
				Administrativo newAdministrativo = new Administrativo(idUsuario, createArea, createExperienciaPrevia);
				usuarioController.registroAdministrativo(newAdministrativo);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + createTipoUsuario);
			}
			//fin de switch case interno

			url = "ServletCrudUsuario?opcion=listarTodosUsuarios";
			break;

		}//case para listar a todos los usuarios
		case "listarTodosUsuarios": {
			request.setAttribute("usuarios", usuarioController.findAllUsuarios());
			url = "listar-usuarios.jsp";
			break;
		}//Fin case que lista a todos los usuarios
		
		//Case que lista los usuarios dependiendo del tipo elegido
		case "listarUsuarios": {

			switch (tipo_usuario) {
			case "Cliente": {
				request.setAttribute("usuarios", clienteController.findAllClientes());
				url = "listar-usuarios-clientes.jsp";
				break;
			}
			case "Profesional": {

				request.setAttribute("usuarios", profesionalController.findAllProfesionales());
				url = "listar-usuarios-profesionales.jsp";
				break;
			}
			case "Administrativo": {

				request.setAttribute("usuarios", administrativoController.findAllAdministrativos());
				url = "listar-usuarios-administrativos.jsp";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + tipo_usuario);
			}
			break;
		}//Fin Case que lista los usuarios por tipo elegido
		
		//Case que redirige al formulario de edicion por tipo de usuario
		case "formUpdateUsuario": {

			String userType = request.getParameter("userType");
			int idFormUsuario = Integer.parseInt(request.getParameter("idUsuario"));
			//Switch Case (interno) para redirigir al formulario correcto
			switch (userType) {
			
			case "Cliente": {
				Cliente cliente = clienteController.findByIdCliente(idFormUsuario);

				url = "editarUsuarioCliente.jsp";
				request.setAttribute("cliente", cliente);
				break;
			}
			case "Profesional": {
				Profesional profesional = profesionalController.findByIdProfesional(idFormUsuario);

				url = "editarUsuarioProfesional.jsp";
				request.setAttribute("profesional", profesional);
				break;
			}
			case "Administrativo": {
				Administrativo administrativo = administrativoController.findByIdAdministrativo(idFormUsuario);

				url = "editarUsuarioAdministrativo.jsp";
				request.setAttribute("administrativo", administrativo);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + userType);
			}//Fin Switch redireccionador a formulario de edición

			break;
		}//Fin Case que redirige formulario de edición
		
		// Case para cambiar los datos de usuario en la base de datos por tipo de usuario
		case "updateUsuario": {
			String updateUserType = request.getParameter("userType");
			int updateIdUsuario = Integer.parseInt(request.getParameter("id"));
			
			String updateNombre = request.getParameter("nombre");
			String updateApellido = request.getParameter("apellidos");
			String updateFechaNacimiento = request.getParameter("fechaNacimiento");
			String updateRun = request.getParameter("run");		
			//Switch Case para cambiar datos de tipo de usuario
			switch (updateUserType) {
			
			case "Cliente": {
				int updatePhone = Integer.parseInt(request.getParameter("telefono"));
				String updateAfp = request.getParameter("afp");
				String updateSistemaSalud = request.getParameter("sistemaSalud");
				String updateDireccion = request.getParameter("direccion");
				String updateComuna = request.getParameter("comuna");
				int updateEdad = Integer.parseInt(request.getParameter("edad"));
				
				Cliente updateCliente = new Cliente(updateIdUsuario, updateNombre, updateApellido, updateFechaNacimiento, updateRun, updatePhone,
						updateAfp, updateSistemaSalud, updateDireccion, updateComuna, updateEdad);
				clienteController.updateCliente(updateCliente);
				url="ServletCrudUsuario?opcion=listarTodosUsuarios";
				break;
			}
			case "Profesional": {				
				String updateTitulo = request.getParameter("titulo");
				String updateFechaIngreso = request.getParameter("fechaIngreso");				
				
				Profesional updateProfesional = new Profesional(updateIdUsuario, updateNombre, updateApellido, updateFechaNacimiento, updateRun,
						 updateTitulo, updateFechaIngreso);
				profesionalController.updateProfesional(updateProfesional);
				url="ServletCrudUsuario?opcion=listarTodosUsuarios";
				break;
			}
			case "Administrativo": {
				String updateArea = request.getParameter("area");
				String updateExperienciaPrevia = request.getParameter("experienciaPrevia");				
				
				Administrativo updateAdministrativo = new Administrativo(updateIdUsuario, updateNombre, updateApellido, updateFechaNacimiento, updateRun,
						updateArea,updateExperienciaPrevia);
				administrativoController.updateAdministrativo(updateAdministrativo);
				url="ServletCrudUsuario?opcion=listarTodosUsuarios";
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + updateUserType);
			}//Fin Switch Case para cambiar datos de tipo de usuario
			
			break;
		}// Case para cambiar los datos de usuario
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}

		request.getRequestDispatcher(url).forward(request, response);
	}
}
