<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Contacto</title>
		<link rel="stylesheet" href="css/styles.css">
		
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">
			<main class="row mt-3 mb-5 " >

				<div class="mt-5 contacto">

				  <h1 class="offset-1 col-10 fs-1 text-center mx-auto"><strong> Enviar una consulta </strong></h1>
				  
				  <form id="form-contacto" action="ServletCrudContacto" method="POST" class="mx-auto col-10 offset-1 col-sm-12 col-md-11 mb-5 mt-3">
					<div class="form-group fs-3 mt-4">
						<label for="name">Nombre completo:</label>
						<input 
								type="text" 
								class="form-control fs-4" 
								id="name" 
								placeholder="Juanito Connor"
								name="nombreCompleto"
								
								>
						<small id="nameHelp" class=" form-text text-danger"> </small>
					</div>
		  
					<div class="form-group fs-3 mt-4">
					  <label for="email">Email: </label>
					  <input 
					  		type="text" 
					  		class="form-control fs-4" 
					  		id="email" 
					  		placeholder="jConnor@skynet.com"
					  		name="email"					  		
					  		>
		  
					  <small id="mailHelp" class=" form-text text-danger"> </small>
					</div> 
		  
					<div class="form-group fs-3 mt-4">
					  <label for="asunto">Asunto:</label>
					  <input 
					  		type="text" 
					  		class="form-control fs-4" 
					  		id="asunto" 
					  		placeholder="-"
					  		name="asunto"					  		
					  		>
					  <small id="asuntoHelp" class=" form-text text-danger" style="display:none;">Asunto no puede estar vacío.</small>
					</div>   
		  
					<div class="form-group fs-3 mt-4">
					  <label for="text-area">Escribenos tu mensaje:</label>
					  <textarea 
					  		class="form-control fs-4" 
					  		id="text-area" 
					  		rows="4" 
					  		placeholder="Escribenos y nos contactaremos contigo."
					  		name="mensaje"					  		
					  		></textarea>
					  <small id="textHelp" class=" form-text text-danger" style="display:none;">Mensaje no puede estar vacío.</small>
					</div>
		  			
		  			<div class="d-grid gap-2"> 
					<button class="btn btn-primary btn-block mt-4 fs-3 m-3" type="submit">Enviar</button>
					<small id="finalHelp" class="form-text text-danger"> </small>
		  			</div>
				  </form>
				</div>
			  </main>		  
		</div>
		
		<!-- Footer -->
	    <jsp:include page="footer.jsp"/>
	    <!-- End Footer -->
		
		<!-- JavaScript de bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
		<!-- Fin JavaScript de bootstrap -->
		<script src="js/validacion-contacto.js"></script>
	</body>
</html>
