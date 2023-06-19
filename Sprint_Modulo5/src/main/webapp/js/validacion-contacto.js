// Validacion de Campos con JavaScript
document.querySelector("#form-contacto").addEventListener("submit", function(event){
	event.preventDefault();
	// Obtener el formulario y sus campos
	
	let name = document.querySelector("#name").value;
	let email = document.querySelector("#email").value;
	let asunto = document.querySelector("#asunto").value;
	let mensaje = document.querySelector("#text-area").value;
	
	let isValid = true;
	let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
		
		// Validando nombre
		if (name.trim() == "") {
			isValid = false;
			document.querySelector("#nameHelp").innerHTML = "El campo Nombre no puede estar vacío";			
		} else if(name.length < 3) {
			document.querySelector("#nameHelp").innerHTML = "El nombre debe contener almenos 3 caracteres.";
		} else {
			document.querySelector("#nameHelp").innerHTML = " ";
		}
		
		// Validando email
		if (email.trim() === "") {
			isValid = false;
			document.querySelector("#mailHelp").innerHTML = "El Campo Email no debe estar vacío";
		} else if (!emailRegex.test(email)) {
			isValid = false;
			document.querySelector("#mailHelp").innerHTML = "Por favor, ingresa un correo electronico válido";
		} else {
			document.querySelector("#mailHelp").style.display = "none";
		}
		

		// Validando asunto. Ocultamos o mostramos mensaje de ayuda con (style="display:orden")" --OJO: debe estar en el DOM y en JS
		if (asunto.length === 0) {
			isValid = false;
			document.querySelector("#asuntoHelp").style.display = "block";
		} else {
			document.querySelector("#asuntoHelp").style.display = "none";
		}
		
		// Validando mensaje. Ocultamos o mostramos mensaje de ayuda con (style="display:orden")" |--OJO: debe estar en el DOM y en JS
		if (mensaje.trim() ==="") {
			isValid = false;
			document.querySelector("#textHelp").style.display = "block";
		} else if (mensaje.length < 10) {
			isValid = false;
			document.querySelector("#textHelp").innerHTML = "Debe contener como mínimo 10 caracteres";
		} else {
			document.querySelector("#textHelp").style.display = "none";
		}
		
		if(isValid) {
		event.target.submit();
	}

});