<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
		<title>Inicio</title>
		<link rel="stylesheet" href="css/styles.css">
	</head>
	<body>
		<!-- Navbar -->
	    <jsp:include page="navbar.jsp"/>
	    <!-- End Navbar -->
	    
		<div class="container mt-5">
			<h1 class="fs-1 text-center d-block d-sm-block">Sistema de Asesoria <span class="d-none d-sm-block d-md-block">de
				Prevención de Riesgos</span></h1>
				
			<div>
			<p class="fw-bold d-lg-block d-md-block d-sm-block d-none text-center" >Sistema de información que permitirá administrar los principales procesos que se llevan a cabo día a día</p>
			</div>
								
			<div class="row mt-4 d-flex justify-content-between">			
				<div class="card d-inline-block col-12 col-sm-5 col-md-5 col-lg-3 mb-3 mx-auto" >
					<img src="https://img.freepik.com/vector-gratis/nuevo-concepto-mensaje-pagina-destino_52683-26980.jpg" class="card-img-top" alt="Celular con carta de mensaje">
					<div class="card-body">							
						<p class="card-text">Envianos un mensaje.</p>
						<a href="contacto.jsp" class="btn btn-primary d-grid gap-2">Contacto</a>							
					</div>						
				</div>
					
				<div class="card d-inline-block col-12 col-sm-5 col-md-5 col-lg-3 mb-3 mx-auto" >
					<img src="https://media.gettyimages.com/id/1269452744/es/vector/lista-de-verificaci%C3%B3n-portapapeles-e-icono-de-l%C3%A1piz-dise%C3%B1o-plano-sobre-fondo-blanco.jpg?s=612x612&w=gi&k=20&c=FwNYmm4Bpsn07BCOUNo37yr1EWwT68mNBy_nYZV5Ee0=" class="card-img-top" alt="escritorio con hojas y checks">
					<div class="card-body">							
						<p class="card-text">Espacio para Creación y Listado de capacitaciones. </p> 
						
						<a href="ServletCrudCapacitacion?opcion=listarCapacitaciones" class="btn btn-primary d-grid gap-2 mt-1">Capacitaciones</a>				
						
					</div>
				</div>
					
				<div class="card mx-auto col-12 col-sm-6 col-md-5 col-lg-3 mb-3" >
					<img src="https://cdn-icons-png.flaticon.com/512/753/753210.png">
					<div class="card-body">							
						<p class="card-text">Espacio para Creación y Listado de usuarios. </p>
						<a href="ServletCrudUsuario?opcion=listarTodosUsuarios" class="btn btn-primary d-grid gap-2 mt-1">Usuarios</a>
					</div>
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

	</body>
</html>