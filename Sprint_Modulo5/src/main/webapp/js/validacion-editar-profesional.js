document.querySelector("#form-editor").addEventListener("submit", function(event){
	event.preventDefault();

	let nombre 		= document.querySelector("#InputNombre").value;
	let apellido	= document.querySelector("#InputApellido").value;
	let fechaNacim  = document.querySelector("#InputFechaNacimiento").value;
	let run 		= document.querySelector("#InputRun").value;

	//Valores de input profesional    
	let titulo = document.querySelector("#InputTitulo").value;
	let fechaIngreso = document.querySelector("#InputFechaIngreso").value;		
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
	
	//titulo
	if (titulo.trim() === "") {
	isValid = false;
		document.querySelector("#tituloHelp").style.display = "block";
	} else {
		document.querySelector("#tituloHelp").innerHTML = " ";
	}
	
	//fecha ingreso
	if (fechaIngreso.trim() === "") {
		isValid = false;
		document.querySelector("#fecIngresHelp").style.display = "block";
	} else {
		document.querySelector("#fecIngresHelp").innerHTML = " ";
	}
	
	if(isValid){
		event.target.submit();
	}

	
});