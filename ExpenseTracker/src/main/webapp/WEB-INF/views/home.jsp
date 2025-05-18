<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Tracker</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<center>
		<h1>Expenses Tracker</h1>
	</center>
	<center>
		<p>${message}</p>
	</center>

	<button>
		<a href="${contextRoot}/expense">Add Expense</a>
	</button>
	<div class="container">
		<table class="table table-hover">
			<thead>
				<tr>
					<td>Expense Name</td>
					<td>Expense Amount</td>
					<!-- <td>Expense Description</td> -->
					<td>Edit</td>
				</tr>
			</thead>
			<c:forEach var="expense" items="${expenses}">
				<tbody>
					<tr>
						<td>${expense.expensename}</td>
						<td>&#8377;${expense.amount}</td>
						 <td><a href="${contextRoot}/${expense.id}/expense">Edit</a></td> 
						<%-- <td><a href="${contextRoot}/expense">Add Expense</a></td> --%>
					</tr>
				</tbody>

			</c:forEach>
		</table>
	</div>

</body>
</html>