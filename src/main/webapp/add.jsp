<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Add Book</title>
	<link rel="stylesheet" href="stylesheet/book.css">
</head>
<body>
	<h1>Add Book</h1>
	<form method="post" action="BookControlller">
		<label>Book Code:</label>
		<input type="text" name="bookCode"><br><br>
		<label>Book Name:</label>
		<input type="text" name="bookName"><br><br>
		<label>Author:</label>
		<input type="text" name="author"><br><br>
		<label>Added Date:</label>
		<input type="date" name="addedDate"><br><br>
		<input type="submit" value="Add Book">
	</form>
</body>
</html>
