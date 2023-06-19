document.querySelector("#form-editor").addEventListener("submit", function(event){
	event.preventDefault();
		
	let nombre 		= document.querySelector("#InputNombre").value;
	let apellido	= document.querySelector("#InputApellido").value;
	let fechaNacim  = document.querySelector("#InputFechaNacimiento").value;
	let run 		= document.querySelector("#InputRun").value;
	//Valores de input tipo cliente    
	let telefono	= document.querySelector("#InputTelefono").value;
	let afp			= document.querySelector("#InputAfp").value;
	let sistSalud	= document.querySelector("#InputSistemaSalud").value;
	let direccion	= document.querySelector("#InputDireccion").value;
	let comuna		= document.querySelector("#InputComuna").value;
	let edad		= document.querySelector("#InputEdad").value;
	
	let isValid = true;
	//name
	if (nombre.trim() === "") {
		isValid = false;
		document.querySelector("#nameHelp").style.display = "block";
	} else {
		document.querySelector("#nameHelp").innerHTML = " ";
	}	
	//lastname
	if (apellido.trim() === "") {
		isValid = false;
		document.querySelector("#lastnameHelp").style.display = "block";
	} else {
		document.querySelector("#lastnameHelp").innerHTML = " ";
	}	    
	
	//fechaNacimiento
	if (fechaNacim.trim() === "") {
		isValid = false;
		document.querySelector("#fechNacimHelp").style.display = "block";
	} else {
		document.querySelector("#fechNacimHelp").innerHTML = " ";
	}
	
	// run      
	if (run.trim() === "") {
		isValid = false;
		document.querySelector("#runHelp").style.display = "block";
	} else if (run.length < 8) {
		isValid = false;
		document.querySelector("#runHelp").innerHTML = "El rut debe contener almenos 8 digitos.";
	} else {
		document.querySelector("#runHelp").innerHTML = " ";
	}

	//telefono
	if (telefono.trim() === "") {
		isValid = false;
		document.querySelector("#telefonoHelp").style.display = "block";
	} else {
		document.querySelector("#telefonoHelp").innerHTML = " ";
	}
	//afp
	if (afp.trim() === "") {
		isValid = false;
		document.querySelector("#afpHelp").style.display = "block";
	} else {				
		document.querySelector("#afpHelp").innerHTML = " ";
	}
	//sistema salud
	if (sistSalud.trim() === "") {
		isValid = false;
		document.querySelector("#sistSaludHelp").style.display = "block";
	} else {
		document.querySelector("#sistSaludHelp").innerHTML = " ";
	}
	//direccion
	if (direccion.trim() === "") {
		isValid = false;
		document.querySelector("#direccionHelp").style.display = "block";
	} else {
		document.querySelector("#direccionHelp").innerHTML = " ";
	}
	//comuna
	if (comuna.trim() === "") {
		isValid = false;
		document.querySelector("#comunaHelp").style.display = "block";
	} else {
		document.querySelector("#comunaHelp").innerHTML = " ";
	}
	//edad
	if (edad.trim() === "") {
		isValid = false;
		document.querySelector("#edadHelp").style.display = "block";
	} else {
		document.querySelector("#edadHelp").innerHTML = " ";
	}
		

	
	if(isValid){
		event.target.submit();
	}

	
});