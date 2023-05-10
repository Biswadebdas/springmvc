<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Login Page</title>
	<link rel="stylesheet" href="stylesheet/style.css">
</head>
<body>
	<div class="container">
		<h2>Login </h2>
		<form method="POST" action="UserController" onsubmit="return validateForm()">
			<label for="username">Username:</label>
			<input type="text" id="username" name="username" minlength="5" maxlength="50" required>

			<label for="password">Password:</label>
			<input type="password" id="password" name="password" minlength="5" maxlength="50" required>

			<button type="submit">Submit</button>
		</form>
	</div>

	<script src="stylesheet/script.js"></script>
</body>
</html>
