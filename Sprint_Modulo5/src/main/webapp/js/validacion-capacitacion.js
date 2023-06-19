
//Validacion de Campos con JavaScript

document.querySelector("#form-capacitacion").addEventListener("submit", function(event) {
	event.preventDefault();
	//*Obtener valores de los imput del DOM
	
	let rutCliente = document.querySelector("#rutCliente").value;
	let dia = document.querySelector("#dia").value;
	let hora = document.querySelector("#hora").value;
	let lugar = document.querySelector("#lugar").value;
	let duracion = document.querySelector("#duracion").value;
	let cantAsistentes = document.querySelector("#cantAsistentes").value;
	//Expresión Regular : Para requerir formato de hora HH:MM
	let horaRegex = /^([01]?[0-9]|2[0-3]):[0-5][0-9]$/;
	let isValid = true;

	//* Validando rut      
	if (rutCliente.trim() === "") {
		isValid = false;
		document.querySelector("#rutClienteHelp").style.display = "block";
	} else if (rutCliente.length < 8) {
		isValid = false;
		document.querySelector("#rutClienteHelp").innerHTML = "El rut debe contener almenos 8 digitos";
	} else {
		document.querySelector("#rutClienteHelp").innerHTML = " ";
	}
	
	//Validando que el campo día no quede vacio
	if (dia.trim() === "") {
		isValid = false;
		document.querySelector("#diaHelp").style.display = "block";
	} else if (dia.length < 5) {
		isValid = false;
		document.querySelector("#diaHelp").innerHTML = "Debe ingresar un día de la semana";
	} else {
		document.querySelector("#diaHelp").innerHTML = " ";
	}
	
	//Validando formato de hora
	if (hora.trim() === "") {
		isValid = false;
		document.querySelector("#horaHelp").style.display = "block";
	}else if (!horaRegex.test(hora)) {
		isValid = false;
		document.querySelector("#horaHelp").innerHTML = "Ingrese una hora con fomrmato valido (HH:MM)";
	}else {
		document.querySelector("#horaHelp").innerHTML = " "
	}
	
	
	//Validando que el campo lugar no quede vacio      
	if (lugar.trim() === "") {
		isValid = false;
		document.querySelector("#lugarHelp").style.display = "block";
	}else {
		document.querySelector("#lugarHelp").innerHTML = " ";
	}
	
	//Validando que el campo duración no quede vacio.      
	if (duracion.trim() === "") {
		isValid = false;
		document.querySelector("#duracionHelp").style.display = "block";
	} else {
		document.querySelector("#duracionHelp").innerHTML = " ";
	}
	
	//Validando cantidad de asistentes
	if (cantAsistentes < 1) {
		isValid = false;
		document.querySelector("#cantAsistHelp").style.display = "block";
	}else {
		document.querySelector("#cantAsistHelp").innerHTML = " "
	}
	

	if(isValid){
		event.target.submit();
	}

});


//	//Validacion General
//	if (rutCliente.length === 0 || dia.length === 0 || hora.length === 0 ||
//		lugar === null || duracion === null || cantAsistentes < 1) {
//		isValid = false;
//		document.querySelector("#finalHelp").innerHTML = "Debe llenar todos los campos correctamente.";
//	}