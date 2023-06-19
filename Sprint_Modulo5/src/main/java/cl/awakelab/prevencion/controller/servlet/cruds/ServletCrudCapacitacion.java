package cl.awakelab.prevencion.controller.servlet.cruds;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.prevencion.controller.CapacitacionController;
import cl.awakelab.prevencion.model.entity.Capacitacion;

/**
 * Servlet implementation class ServletCrudCapacitacion
 */
@WebServlet("/ServletCrudCapacitacion")
public class ServletCrudCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcion = request.getParameter("opcion");		
		// creo la instancia del controlador
	    CapacitacionController capacitacionController  = new CapacitacionController ();
	    String url = "index.jsp";
	    
	    switch (opcion) {
		case "crearCapacitacion": {
			
			String rutcliente = request.getParameter("rutCliente");
			String dia = request.getParameter("dia");
			String hora = request.getParameter("hora");
			String lugar = request.getParameter("lugar");
			String duracion = request.getParameter("duracion");
			int cantasistentes = Integer.parseInt(request.getParameter("cantAsistentes"));
			
			Capacitacion newCapacitacion = new Capacitacion(rutcliente, dia, hora, lugar, duracion,cantasistentes);
			
			//Registro de capacitacion a la base de datos.
			capacitacionController.registroCapacitacion(newCapacitacion);		
			url = "ServletCrudCapacitacion?opcion=listarCapacitaciones";
			break;
		}
		case "listarCapacitaciones" : {
			//Guardar todas las capacitaciones para enviarlo al front-end en la variable "capacitaciones"
			request.setAttribute("capacitaciones", capacitacionController.findAllCapacitaciones());			
			
			url ="listar-capacitaciones.jsp";
	         
	         break;
	    }
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
	    
	    request.getRequestDispatcher(url).forward(request, response);
	}

}
