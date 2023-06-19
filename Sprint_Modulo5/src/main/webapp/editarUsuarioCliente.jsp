<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Editar Usuario-Cliente</title>
		<link rel="stylesheet" href="css/styles.css">
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">			
			
		 <div class="row mt-2">			
   		<!-- Codigo del Formulario Edicion Cliente -->
		    <div class="col-xs-12 offset-1 col-md-10 " style="justify-content: space-around;">
				<h1 class="text-center">Editar perfil de Cliente</h1>
		    
		      <form id="form-editor" action="ServletCrudUsuario" method="post" >
		      
		        <div class="mb-3">
		        
		           <input 
		           	type="hidden"
                    class="form-control"
                    id="id"
                    name="id"
                    value="${cliente.id}"
                    placeholder=""
                    required
                        />
                        
		           <input 
		           	type="hidden"
                    class="form-control"
                    id="tipoUsuario"
                    name="userType"
                    value="${cliente.tipoUsuario}"
                    required
                        />
                        
		          <label for="InputNombre" class="form-label">Nombre(s):</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputNombre"
		        	name="nombre"
		        	placeholder="${cliente.nombre}"
		          />
		          <small id="nameHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		
		        <div class="mb-3">
		          <label for="InputApellido" class="form-label">Apellido(s):</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputApellido"
		            name="apellidos"
		            placeholder="${cliente.apellido}"
		          />
		          <small id="lastnameHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		        <div class="mb-3">
		          <label for="InputFechaNacimiento" class="form-label">Fecha de nacimiento:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputFechaNacimiento"
		        	name="fechaNacimiento"
		        	placeholder="${cliente.fechaNacimiento}"
		          />
		          <small id="fechNacimHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		        <div class="mb-3">
		          <label for="InputRun" class="form-label">RUN:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputRun"
		        	name="run"
		        	placeholder="${cliente.run}"
		          />
		          <small id="runHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		        <div class="mb-3">
		          <label for="InputTelefono" class="form-label">Teléfono:</label>
		          <input
		            type="number"
		            class="form-control"
		            id="InputTelefono"
		        	name="telefono"
		        	placeholder="${cliente.telefono}"
		          />
		          <small id="telefonoHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		        <div class="mb-3">
		          <label for="InputAfp" class="form-label">AFP:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputAfp"
		        	name="afp"
		        	placeholder="${cliente.afp}"
		          />
		          <small id="afpHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		        	<div class="mb-3">
		          <label for="InputSistemaSalud" class="form-label">Sistema de Salud:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputSistemaSalud"
		        	name="sistemaSalud"
		        	placeholder="${cliente.sistemaSalud}"
		          />
		          <small id="sistSaludHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		        	<div class="mb-3">
		          <label for="InputDireccion" class="form-label">Dirección:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputDireccion"
		        	name="direccion"
		        	placeholder="${cliente.direccion}"
		          />
		          <small id="direccionHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		        	<div class="mb-3">
		          <label for="InputComuna" class="form-label">Comuna:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputComuna"
		        	name="comuna"
		        	placeholder="${cliente.comuna}"
		          />
		          <small id="comunaHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		        	<div class="mb-3">
		          <label for="InputEdad" class="form-label">Edad:</label>
		          <input
		            type="number"
		            class="form-control"
		            id="InputEdad"
		        	name="edad"
		        	placeholder="${cliente.edad}"
		          />
		          <small id="edadHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		       
		        <input type="hidden" name="opcion" value="updateUsuario">
		        <div class="d-grid gap-2">
		          <button type="submit" class="btn btn-primary">Confirmar</button>
		        </div>
		        		        
		      </form>
		
		    </div>
		  </div>
		<!-- Fin Codigo del Formulario Login -->
			

		</div>
		
		<!-- Footer -->
	    <jsp:include page="footer.jsp"/>
	    <!-- End Footer -->
	    
		<!-- JavaScript de bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
		<!-- Fin JavaScript de bootstrap -->
		<script src="js/validacion-editar-cliente.js"></script>
</body>
</html>