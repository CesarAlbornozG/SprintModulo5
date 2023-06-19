
// * Mostrar las id por el tipo de cliente con javascript *

//var select = document.getElementById('tipoUsuario');
//select.addEventListener('change', function(){
//    var selectedOption = this.options[select.selectedIndex];
//    console.log(selectedOption.value + ': ' + selectedOption.text);
//    if(selectedOption.value == "administrativo"){
//		document.getElementById('administrativo').style.display = 'block';
//	}else if(selectedOption.value == "cliente"){
//		document.getElementById('cliente').style.display = 'block';
//	}else if(selectedOption.value == "profesional"){
//		document.getElementById('profesional').style.display = 'block';
//	}
//});

// * Mostrar las id por el tipo de cliente con JQuery *
$(document).ready(function() {
	$("#tipoUsuario").click(function() {

		const tipoUsuarioValue = $("#tipoUsuario").val()

		if (tipoUsuarioValue == "Cliente") {
			$("#cliente").show();
			$("#profesional").hide();
			$("#administrativo").hide();

		} else if (tipoUsuarioValue == "Profesional") {
			$("#cliente").hide();
			$("#profesional").show();
			$("#administrativo").hide();

		} else if (tipoUsuarioValue == "Administrativo") {
			$("#cliente").hide();
			$("#profesional").hide();
			$("#administrativo").show();
		}



	});
});