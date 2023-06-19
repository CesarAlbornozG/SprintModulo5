package cl.awakelab.prevencion.controller.servlet.cruds;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.prevencion.controller.ContactoController;
import cl.awakelab.prevencion.model.entity.Contacto;

/**
 * Servlet implementation class ServletCrudContacto
 */
@WebServlet("/ServletCrudContacto")
public class ServletCrudContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ContactoController contactoController = new ContactoController();
		
		String nombreCompleto = request.getParameter("nombreCompleto");
		String email = request.getParameter("email");
		String asunto = request.getParameter("asunto");
		String mensaje = request.getParameter("mensaje");
		
		Contacto newContacto = new Contacto(nombreCompleto, email, asunto, mensaje);
		System.out.println(newContacto.toString());
		contactoController.registroContacto(newContacto);
		
		response.sendRedirect("index.jsp");
		
	}

}
