document.querySelector("#form-editor").addEventListener("submit", function(event){
	event.preventDefault();
	
	let nombre 		= document.querySelector("#InputNombre").value;
	let apellido	= document.querySelector("#InputApellido").value;
	let fechaNacim  = document.querySelector("#InputFechaNacimiento").value;
	let run 		= document.querySelector("#InputRun").value;
	//Valores de input administrativo
	let area = document.querySelector("#InputArea").value;
	let experienciaPrevia = document.querySelector("#InputExperiencia").value;
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
	
	//area
	if (area.trim() === "") {
		isValid = false;
		document.querySelector("#areaHelp").style.display = "block";
	} else {
		document.querySelector("#areaHelp").innerHTML = " ";
	}
	//experiencia previa
	if (experienciaPrevia.trim() === "") {
		isValid = false;
		document.querySelector("#exPrevHelp").style.display = "block";
	} else {
		document.querySelector("#exPrevHelp").innerHTML = " ";
	}

	if(isValid){
		event.target.submit();
	}

	
});