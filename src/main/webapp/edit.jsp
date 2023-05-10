<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Edit Book</title>
<link rel="stylesheet" href="stylesheet/table.css">
</head>
<body>
	<h1>Edit Book</h1>
	<form action="edit.jsp" method="post">
		<input type="hidden" name="bookCode" value="${book.bookCode}" />
		<label for="bookName">Book Name:</label>
		<input type="text" name="bookName" value="${book.bookName}" required /><br /><br />
		<label for="author">Author:</label>
		<select name="author">
			<c:forEach var="author" items="${authorList}">
				<option value="${author}" <c:if test="${author eq book.author}">selected</c:if>>${author}</option>
			</c:forEach>
		</select><br /><br />
		<button type="submit">Save Changes</button>
		<button type="button" onclick="window.location.href='bookList.jsp'">Cancel</button>
	</form>
</body>
</html>
