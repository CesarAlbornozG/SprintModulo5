<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Editar Usuario-Administrativo</title>
		<link rel="stylesheet" href="css/styles.css">
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">
			
			
		 <div class="row mt-2">
			
	   	<!-- Codigo del Formulario Edicion Administrativo -->
		    <div class="col-xs-12 offset-1 col-md-10 " style="justify-content: space-around;">
				<h1 class="text-center">Editar perfil de Administrativo</h1>
		    
		      <form id="form-editor" action="ServletCrudUsuario" method="post" >
		      
		      	<div class="mb-3">
		      		
		      		<input 
		           	type="hidden"
                    class="form-control"
                    id="id"
                    name="id"
                    value="${administrativo.id}"
                    required
                        />
                        
		           <input 
		           	type="hidden"
                    class="form-control"
                    id="tipoUsuario"
                    name="userType"
                    value="${administrativo.tipoUsuario}"
                    required
                        />
		      		
		          <label for="InputNombre" class="form-label">Nombre(s):</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputNombre"
		        	name="nombre"
		        	placeholder="${administrativo.nombre}"
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
		            placeholder="${administrativo.apellido}"
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
		        	placeholder="${administrativo.fechaNacimiento}"
		          />
		          <small id="fechNacimHelp" class="form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		            <div class="mb-3">
		          <label for="InputRun" class="form-label">RUN:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputRun"
		        	name="run"
		        	placeholder="${administrativo.run}"
		          />
		          <small id="runHelp" class="form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		            <div class="mb-3">
		          <label for="InputArea" class="form-label">Área:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputArea"
		        	name="area"
		        	placeholder="${administrativo.area}"
		          />
		          <small id="areaHelp" class="form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        
		        
		            <div class="mb-3">
		          <label for="InputExperiencia" class="form-label">Experiencia previa:</label>
		          <input
		            type="text"
		            class="form-control"
		            id="InputExperiencia"
		        	name="experienciaPrevia"
		        	placeholder="${administrativo.experienciaPrevia}"
		          />
		          <small id="exPrevHelp" class="form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
		        </div>
		        <input type="hidden" name="opcion" value="updateUsuario">
		        <div class="d-grid gap-2">
		          <button type="submit" class="btn btn-primary">Confirmar</button>
		        </div>
		        		        
		      </form>
		
		    </div>
		  </div>
		<!-- Fin Codigo del Formulario Editar -->
			

		</div>
		
		<!-- Footer -->
	    <jsp:include page="footer.jsp"/>
	    <!-- End Footer -->
	    
		<!-- JavaScript de bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
		<!-- Fin JavaScript de bootstrap -->
		<script src="js/validacion-editar-admin.js"></script>
	</body>
</html>
