<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Crear Usuario</title>
		<link rel="stylesheet" href="css/styles.css">
		
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">
			
			
		 <div class="row mt-2">
			
			
	
   	<!-- Codigo del Formulario Crear Usuario -->
		    <div class="mx-auto col-10 offset-1 col-sm-12 col-md-11" style="justify-content: space-around;">
				<h1 class="text-center">Registro Nuevo Usuario</h1>
		    
		      <form id="crearusuario-form" action="ServletCrudUsuario" method="post" >
		      
		        <div class="mb-3">
		          <label for="user" class="form-label">Usuario</label>
		          <input
		            type="text"
		            class="form-control"
		            id="user"
		        	name="usuario"		        	
		          />
		          <small id="userHelp" class="text-danger" style="display:none;">El campo usuario no puede estar vacío </small>
		        </div>
		
		        <div class="mb-3">
		          <label for="pass" class="form-label">Ingrese su contraseña</label>
		          <input
		            type="password"
		            class="form-control"
		            id="password"
		            name="password"
		          />
		          <small id="passwordHelp" class="text-danger" style="display:none;">El campo contraseña no puede estar vacío </small>
		          </div>
		        
		            <div class="mb-3">
		          <label for="run" class="form-label">Run:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="run"
		        	name="run"
		          />
		          <small id="runclienteHelp" class="text-danger" style="display:none;">El campo RUN no puede estar vacío </small>
		          <small id="runclienteHelp2" class="text-danger" style="display:none;">El run debe tener almenos 8 digitos </small>
		        </div>
		        
		            <div class="mb-3">
		          <label for="fechaNacimiento" class="form-label">Fecha de Nacimiento:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="fechaNacimiento"
		        	name="fechaNacimiento"
		          />
		          <small id="fechaNacimientoHelp" class="text-danger" style="display:none;">El campo fecha de nacimiento no puede estar vacío </small>
		        </div>
		        
		            <div class="mb-3">
		          <label for="names" class="form-label">Nombre(s):</label>
		          <input
		            type="text"
		            class="form-control"
		            id="names"
		        	name="nombre"
		          />
		          <small id="namesHelp" class="text-danger" style="display:none;">El campo nombres no puede estar vacío </small>
		        </div>
		        
		        
		        <div class="mb-3">
		          <label for="lastName" class="form-label">Apellido(s):</label>
		          <input
		            type="text"
		            class="form-control"
		            id="lastName"
		        	name="apellido"
		          />
		          <small id="lastNameHelp" class="text-danger" style="display:none;">El campo apellidos no puede estar vacío </small>
		        </div>
		        
		        <div class="mb-5">
		        	<label for="tipoUsuario" class="form-label">Tipo de Usuario:</label>		        	
                    <select id="tipoUsuario" name="tipoUsuario" class="form-select" aria-label="Default select example" >
						<option value="" selected disabled>Elegir un Tipo de Usuario</option>
						<option value="Cliente">Cliente</option>
						<option value="Profesional">Profesional</option>
						<option value="Administrativo">Administrativo</option>
					</select>
		        </div>
		        
		        <div id="cliente" style="display: none;" class="mt-3">	
		        	<h4>Datos requeridos para Usuarios de Tipo Cliente</h4>	
		        		        	
					<label for="telefono" class="form-label">Teléfono:</label>
				    <input type="number" name="telefono" id="telefono" class="form-control"/>    
		        	<small id="telefonoHelp" class="text-danger" style="display:none;">El campo teléfono no puede estar vacío </small>
					
					<label for="afp" class="form-label">AFP:</label>
				    <input type="text" name="afp" id="afp" class="form-control"/>
				    <small id="afpHelp" class="text-danger" style="display:none;">El campo AFP no puede estar vacío </small>
				    
					<label for="sistemaSalud" class="form-label">Sistema Salud:</label>
				    <input type="text" name="sistemaSalud" id="sistemaSalud" class="form-control"/>
				    <small id="sistemaSaludHelp" class="text-danger" style="display:none;">El campo sistema salud no puede estar vacío </small>
		        	
					<label for="direccion" class="form-label">Dirección:</label>
				    <input type="text" name="direccion" id="direccion" class="form-control"/>
				    <small id="direccionHelp" class="text-danger" style="display:none;">El campo direccion no puede estar vacío </small>
				    
					<label for="comuna" class="form-label">Comuna:</label>
				    <input type="text" name="comuna" id="comuna" class="form-control"/>
				    <small id="comunaHelp" class="text-danger" style="display:none;">El campo comuna no puede estar vacío </small>
				    
					<label for="edad" class="form-label">Edad:</label>
				    <input type="number" name="edad" id="edad" class="form-control"/>
				    <small id="edadHelp" class="text-danger" style="display:none;">El campo edad no puede estar vacío </small>
				</div>
				
				<div id="profesional" style="display: none;">
					<h4>Datos requeridos para Usuarios de Tipo Profesional</h4>
					<label for="titulo" class="form-label mt-3">Título:</label>
				    <input type="text" name="titulo" id="titulo" class="form-control"/>
				    <small id="tituloHelp" class="text-danger" style="display:none;">El campo título no puede estar vacío </small>

					<label for="fechaIngreso" class="form-label mt-3">Fecha de Ingreso:</label>
				    <input type="text" name="fechaIngreso" id="fechaIngreso" class="form-control"/>
				    <small id="fechaIngresoHelp" class="text-danger" style="display:none;">El campo fecha de ingreso no puede estar vacío </small>
				</div>
				
				<div id="administrativo" style="display: none;">	
					<h4>Datos requeridos para Usuarios de Tipo Administrativo</h4>						
					<label for="area" class="form-label mt-3">Área:</label>
				    <input type="text" name="area" id="area" class="form-control"/>
				    <small id="areaHelp" class="text-danger" style="display:none;">El campo área no puede estar vacío </small>

					<label for="experienciaPrevia" class="form-label mt-3">Experiencia previa:</label>
				    <input type="text" name="experienciaPrevia" id="experienciaPrevia" class="form-control"/>
				    <small id="experienciaPreviaHelp" class="text-danger" style="display:none;">El campo experiencia previa no puede estar vacío </small>       		    
				</div>
				
		        <input type="hidden" name="opcion" value="crearUsuario">
		        <div class="d-grid gap-2 mt-4">
		          <button type="submit" class="btn btn-primary">Registrar</button>
		        </div>
		        		        
		      </form>
		
		    </div>
		  </div>
		<!-- Fin Codigo del Formulario Crear Usuario-->
			

		</div>
		
		<!-- Footer -->
	    <jsp:include page="footer.jsp"/>
	    <!-- End Footer -->
	    
	    <!-- JQuery -->
	    <script
          src="https://code.jquery.com/jquery-3.7.0.min.js"
          integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
          crossorigin="anonymous">
        </script>
		<script type="text/javascript" src="js/mostrar-id-usuario.js"></script>
	    <!-- Fin JQuery -->
	    
		<!-- JavaScript de bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
		<!-- Fin JavaScript de bootstrap -->
		
		<script src="js/validacion-crear-usuario.js"></script>
	</body>
</html>