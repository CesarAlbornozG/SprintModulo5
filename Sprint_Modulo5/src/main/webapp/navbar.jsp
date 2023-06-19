<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle " href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Usuario
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="ServletCrudUsuario?opcion=listarTodosUsuarios">Listar Usuarios</a></li>
            <li><a class="dropdown-item" href="crearUsuario.jsp">Crear Usuarios</a></li>
          <!-- <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here(sin Servicio)</a></li>   -->
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle " href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Capacitacion
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="ServletCrudCapacitacion?opcion=listarCapacitaciones">Listar Capacitaciones</a></li>
            <li><a class="dropdown-item" href="crearCapacitacion.jsp">Crear Capacitaciones</a></li>
          <!-- <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here(sin Servicio)</a></li>   -->
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="contacto.jsp">Contacto</a>
        </li>
      </ul>   
      
     <c:if test="${not empty sessionScope.usuario}">
     	<p class="mx-3 my-2 text-primary"> Bienvenido(a) <span class="fw-bold text-capitalize"> ${sessionScope.usuario}</span></p>
     	<div class="row col-sm-3 col-l-2" style="justify-content: space-around;">
     	
     		<a href="ServletLogout">
     		<button class="btn btn-outline-danger " type="submit"> Cerrar Session</button>
     		</a>
     	
     	</div>
     </c:if>
     
    </div>
  </div>
</nav>