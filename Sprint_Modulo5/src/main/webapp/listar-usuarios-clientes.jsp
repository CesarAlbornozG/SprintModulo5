<%@page import="cl.awakelab.prevencion.model.entity.Cliente"%>
<%@page import="cl.awakelab.prevencion.model.entity.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Listar Usuarios</title>
		<link rel="stylesheet" href="css/styles.css">
		<!-- Font Awesome -->
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	    <!-- /Font Awesome -->
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">
			<div class="row col">
				<h1 class="text-center">Listado Clientes</h1>
			<!-- Formulario para elegir tipo Usuario -->
				<div class="col-12 d-flex justify-content-around">				
					<form  action="ServletCrudUsuario" method="GET" class="col-10 form mb-2 mt-3">
						<select id="tipoUsuario" name="tipoUsuario" class="form-select mb-3" aria-label="Default select example" onchange="enviar-formulario" required >
							<option value="" selected disabled>Elegir un Tipo de Usuario</option>
							<option value="Cliente">Cliente</option>
							<option value="Profesional">Profesional</option>
							<option value="Administrativo">Administrativo</option>
						</select>
						<input type="hidden" name="opcion" value="listarUsuarios">
						<div>
						<button type="submit" class="btn btn-primary btn-block  fs-4 col-12">Listar</button>
						</div>
					</form>
				</div>
				<!--Fin Formulario para elegir tipo Cliente -->
				
				<!-- Boton que muestra todos los usuarios -->
				<div class="col d-flex justify-content-around">
					<a href="ServletCrudUsuario?opcion=listarTodosUsuarios" class="btn btn-success d-grid gap-2 mb-3 mt-2">Listar Todos los Usuarios</a>
				</div>
				<!-- Fin Boton que muestra todos los usuarios -->
				
				<!-- Tabla Listado de datos-->
			      <table class="table table-striped table-hover">
			        <thead class="table-dark">
			        <tr>
			          
			          <th scope="col">Nombre(s)</th>
			          <th scope="col">Apellidos</th>
			          <th scope="col">Edad</th>
			          <th scope="col">Run</th>
			          <th scope="col">Fecha de Nacimiento</th>
			          <th scope="col">Teléfono</th>
			          <th scope="col">AFP</th>
			          <th scope="col">Sistema de Salud</th>
			          <th scope="col">Direccion</th>
			          <th scope="col">Comuna</th>			       
			          
			          <th scope="col">Acciones</th>
			        </tr>
			        </thead>
			        
			        <tbody class="table-group-divider">
			        <!-- row = fila -->
			
			
			 		<% List<Cliente> usuarios = (List<Cliente>)request.getAttribute("usuarios"); 
			 			if(usuarios != null ) {	
			 				
			 			 for(Cliente user: usuarios) { 
			 				 
			 			 %>
			        <tr>
			          <td><%=user.getNombre()%></td>
			          <td><%=user.getApellido()%></td>
			          <td><%=user.getEdad()%></td>
			          <td><%=user.getRun()%></td>
			          <td><%=user.getFechaNacimiento()%></td>
			          <td><%=user.getTelefono()%></td>			          
			          <td><%=user.getAfp()%></td>
			          <td><%=user.getSistemaSalud()%></td>
			          <td><%=user.getDireccion()%></td>
			          <td><%=user.getComuna()%></td>			        
			          
			          <td>
	                  	<a class="text-success" href="ServletCrudUsuario?opcion=formUpdateUsuario&idUsuario=<%=user.getId()%>&userType=<%=user.getTipoUsuario()%>"><i class="fa-solid fa-pen-to-square mx-3"></i></a>	             
	                  </td>
			        </tr>
			        
			   		<% }
			   		} %>
			        </tbody>			        
			      </table>	
			      <!-- Fin Tabla -->
			   </div>	
			</div>	
				
			<div class="row">
				<div class="col d-flex justify-content-around">
        			<a class="btn btn-success" href="crearUsuario.jsp" ><i class="mx-1 fa-solid fa-plus"></i>Crear Nuevo Usuario</a>
        		</div>
			</div>	

		</div>
		
		<!-- Footer -->
	    <jsp:include page="footer.jsp"/>
	    <!-- End Footer -->
	    
		<!-- JavaScript de bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
		<!-- Fin JavaScript de bootstrap -->
		
		<script src="js/listar-por-usuario.js"></script>
	</body>
</html>