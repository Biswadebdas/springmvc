function validateForm() {
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;

	if (username.length < 5 || username.length > 50) {
		alert("Username must be between 5 and 50 characters.");
		return false;
	}

	if (password.length < 5 || password.length > 50) {
		alert("Password must be between 5 and 50 characters.");
		return false;
	}

	return true;
}
