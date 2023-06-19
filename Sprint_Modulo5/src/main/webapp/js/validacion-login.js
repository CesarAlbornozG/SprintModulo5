document.querySelector("#form-login").addEventListener('submit', function(event) {
	event.preventDefault();
	//* input user
	let user = document.querySelector("#InputUser").value;
	//* input password
	let password = document.querySelector("#InputPassword").value;
	
	let isValid = true;
		// user
	
		if (user.trim() === "") {
			isValid = false;
			document.querySelector("#userHelp").style.display = "block";			
		} else {
			document.querySelector("#userHelp").innerHTML = " ";
		}
		  
		//* Contraseña	
		if (password.trim() === "") {
			isValid = false;
			document.querySelector("#passHelp").style.display = "block";			
		}
		 else {
			document.querySelector("#passHelp").innerHTML = " ";
		}
		
		if(isValid) {
		event.target.submit();
		}

});