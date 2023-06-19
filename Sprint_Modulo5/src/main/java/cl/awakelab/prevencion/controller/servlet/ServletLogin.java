package cl.awakelab.prevencion.controller.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * EjercicioGrupal 6 - Modulo 5 
 * Integrantes:
 * -Cesar Albornoz
 * -Catalina Muñoz
 * -Jaime Godoy
 * -Anthony Flores
 * 
 *  */

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher requestDispatcher;
		 requestDispatcher = request.getRequestDispatcher("login.jsp");
		 requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  String usuario = request.getParameter("usuario");
	  String password = request.getParameter("password");
	  
	  RequestDispatcher requestDispatcher;
	  
	  if(usuario.equals("admin") && password.equals("1234")) {
	    HttpSession session = request.getSession();
	    
	    session.setAttribute("usuario", usuario);
	    requestDispatcher = request.getRequestDispatcher("index.jsp");
	    
	  } else {
		  requestDispatcher = request.getRequestDispatcher("login.jsp");
	    
	  }
	  
	  requestDispatcher.forward(request, response);
	}
	
}
