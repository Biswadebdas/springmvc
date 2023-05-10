<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>Book List</title>
	<link rel="stylesheet" href="stylesheet/table.css">
</head>
<body>
	<h1>Library management</h1>
	<table>
		<thead>
			<tr>
				<th>Book Code</th>
				<th>Book Name</th>
				<th>Author</th>
				<th>Added Date</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${Book}">
				<tr>
					<td>${book.bookCode}</td>
					<td>${book.bookName}</td>
					<td>${book.author}</td>
					<td>${book.addedDate}</td>
					<td><a href="edit.jsp">Edit</a></td>
					<td><a href="delete.jsp" onclick="return confirm('Are you sure you want to delete this book?')">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add.jsp"><button>Add Book</button></a>
</body>
</html>
