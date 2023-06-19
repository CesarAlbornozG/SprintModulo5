// Validacion de Campos con JavaScript
document.querySelector("#crearusuario-form").addEventListener("submit", function(event){
	event.preventDefault();

	// Obtener el formulario y sus campos
	let user = document.querySelector("#user").value;
	let password = document.querySelector("#password").value;
	let run = document.querySelector("#run").value;
	let fechaNacimiento = document.querySelector("#fechaNacimiento").value;
	let names = document.querySelector("#names").value;
	let lastName = document.querySelector("#lastName").value;
	let tipoUser = document.querySelector("#tipoUsuario").value;
	//tipo cliente    
	let telefono = document.querySelector("#telefono").value;
	let afp = document.querySelector("#afp").value;
	let sistemaSalud = document.querySelector("#sistemaSalud").value;
	let direccion = document.querySelector("#direccion").value;
	let comuna = document.querySelector("#comuna").value;
	let edad = document.querySelector("#edad").value;
	//profesional    
	let titulo = document.querySelector("#titulo").value;
	let fechaIngreso = document.querySelector("#fechaIngreso").value;
	//administrativo
	let area = document.querySelector("#area").value;
	let experienciaPrevia = document.querySelector("#experienciaPrevia").value;
	let isValid = true;
	
		// user    
		if (user.trim() === "") {
			isValid = false;
			document.querySelector("#userHelp").style.display = "block";
		} else {
			document.querySelector("#userHelp").style.display = "none";
		}
		
		// password
		if (password.trim() === "") {
			isValid = false;
			document.querySelector("#passwordHelp").style.display = "block";
		} else {
			document.querySelector("#passwordHelp").style.display = "none";
		}
		
		// run
        if (run.trim() === "") {
            isValid = false;
            document.querySelector("#runclienteHelp").style.display = "block";
            document.querySelector("#runclienteHelp2").style.display = "none";
        } else if (run.length < 8) {
            isValid = false;
            document.querySelector("#runclienteHelp2").style.display = "block";
            document.querySelector("#runclienteHelp").style.display = "none";
        } else {
            document.querySelector("#runclienteHelp").style.display = "none";
        }
        
		//fechaNacimiento
		if (fechaNacimiento.trim() === "") {
			isValid = false;
			document.querySelector("#fechaNacimientoHelp").style.display = "block";
		} else {
			document.querySelector("#fechaNacimientoHelp").style.display = "none";
		}
		//names
		if (names.trim() === "") {
			isValid = false;
			document.querySelector("#namesHelp").style.display = "block";
		} else {
			document.querySelector("#namesHelp").style.display = "none";
		}
		//lastname
		if (lastName.trim() === "") {
			isValid = false;
			document.querySelector("#lastNameHelp").style.display = "block";
		} else {
			document.querySelector("#lastNameHelp").style.display = "none";
		}
		//tipo
		switch (tipoUser) {
			case "Cliente":
				//telefono
				if (telefono.trim() === "") {
					isValid = false;
					document.querySelector("#telefonoHelp").style.display = "block";
				} else {
					document.querySelector("#telefonoHelp").style.display = "none";
				}
				//afp
				if (afp.trim() === "") {
					isValid = false;
					document.querySelector("#afpHelp").style.display = "block";
				} else {
					document.querySelector("#afpHelp").style.display = "none";
				}
				//sistema salud
				if (sistemaSalud.trim() === "") {
					isValid = false;
					document.querySelector("#sistemaSaludHelp").style.display = "block";
				} else {
					document.querySelector("#sistemaSaludHelp").style.display = "none";
				}
				//direccion
				if (direccion.trim() === "") {
					isValid = false;
					document.querySelector("#direccionHelp").style.display = "block";
				} else {
					document.querySelector("#direccionHelp").style.display = "none";
				}
				//comuna
				if (comuna.trim() === "") {
					isValid = false;
					document.querySelector("#comunaHelp").style.display = "block";
				} else {
					document.querySelector("#comunaHelp").style.display = "none";
				}
				//edad
				if (edad.trim() === "") {
					isValid = false;
					document.querySelector("#edadHelp").style.display = "block";
				} else {
					document.querySelector("#edadHelp").style.display = "none";
				}

				break;
			case "Profesional":
				//titulo
				if (titulo.trim() === "") {
					isValid = false;
					document.querySelector("#tituloHelp").style.display = "block";
				} else {
					document.querySelector("#tituloHelp").style.display = "none";
				}
				//fecha ingreso
				if (fechaIngreso.trim() === "") {
					isValid = false;
					document.querySelector("#fechaIngresoHelp").style.display = "block";
				} else {
					document.querySelector("#fechaIngresoHelp").style.display = "none";
				}
				break;
			case "Administrativo":
				//area
				if (area.trim() === "") {
					isValid = false;
					document.querySelector("#areaHelp").style.display = "block";
				} else {
					document.querySelector("#areaHelp").style.display = "none";
				}
				//experiencia previa
				if (experienciaPrevia.trim() === "") {
					isValid = false;
					document.querySelector("#experienciaPreviaHelp").style.display = "block";
				} else {
					document.querySelector("#experienciaPreviaHelp").style.display = "none";
				}
				break;
			default:
				//este código se ejecutará si ninguno de los casos coincide con la expresión
				break;
		}

	

		//* Si la funcion validate retorna un false no se enviará el formulario
		if (isValid) {
			event.target.submit();
			// impido que se envie el formulario            
		}

});