<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Crear Capacitación</title>
		<link rel="stylesheet" href="css/styles.css">
		
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">
			<!-- Codigo formulario Capacitacion -->
			<main class="row mt-3 mb-5 " >

				<div class="mt-5 contacto">

				  <h2 class="offset-1 col-10 fs-1 text-center"><strong> Crear capacitacion </strong></h2>
				  
				  <form id="form-capacitacion" action="ServletCrudCapacitacion" method="POST" class="mx-auto col-10 offset-1 col-sm-12 col-md-11 mb-2 mt-3">
					<div class="form-group fs-3 mt-4">
						<label for="rutCliente">Rut de cliente:</label>
						<input 
							type="text" 
							class="form-control fs-4" 
							id="rutCliente" 
							placeholder="88.231.332-k"
							name="rutCliente"
							>
						<small id="rutClienteHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div>
		  
					<div class="form-group fs-3 mt-4">
					  <label for="dia">Día: </label>
					  <input 
						  type="text" 
						  class="form-control fs-4" 
						  id="dia"
						  placeholder="Lunes, Martes, Mier..."
						  name="dia"
						   >		  
					  <small id="diaHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div> 
		  
					<div class="form-group fs-3 mt-4">
					  <label for="hora">Hora:</label>
					  <input 
					  		type="text" 
					  		class="form-control fs-4" 
					  		id="hora" 
					  		placeholder="HH:MM"
					  		name="hora"
					  		>
					  <small id="horaHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div>   
					<div class="form-group fs-3 mt-4">
					  <label for="lugar">Lugar:</label>
					  <input 
					  		type="text" 
					  		class="form-control fs-4" 
					  		id="lugar" 
					  		placeholder="-"
					  		name="lugar"
					  		>
					  <small id="lugarHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div>   
					<div class="form-group fs-3 mt-4">
					  <label for="duracion">Duración:</label>
					  <input 
					  		type="text" 
					  		class="form-control fs-4" 
					  		id="duracion" 
					  		placeholder="X horas"
					  		name="duracion"
					  		>
					  <small id="duracionHelp" class=" form-text text-danger" style="display:none;">El campo no puede estar vacio.</small>
					</div>   
					<div class="form-group fs-3 mt-4">
					  <label for="cantAsistentes">Cantidad de asistentes:</label>
					  <input 
					  		type="number" 
					  		class="form-control fs-4" 
					  		id="cantAsistentes" 
					  		placeholder="-"
					  		name="cantAsistentes"
					  		value = 0
					  		>
					  <small id="cantAsistHelp" class=" form-text text-danger" style="display:none;">La cantidad de asistentes no puede ser 0.</small>
					</div>
					
					<input type="hidden" name="opcion" value="crearCapacitacion">
		  			<div>
					<button class="btn btn-primary btn-block mt-4 fs-3 m-3" type="submit" >Registrar Capacitación</button>
					<small id="finalHelp" class="form-text text-danger"> </small>
		  			</div>
				  </form>

				</div>
			  </main>
			  <!-- Fin Codigo formulario Capacitacion -->
				 		  
		</div>
		
		<!-- Footer -->
	    <jsp:include page="footer.jsp"/>
	    <!-- End Footer -->
		
		<!-- JavaScript de bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
		<!-- Fin JavaScript de bootstrap -->
		<script src="js/validacion-capacitacion.js"></script>
	</body>
</html>