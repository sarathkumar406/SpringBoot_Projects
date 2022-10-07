<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>Expense Tracker</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript">
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 



</script>
<!-- Custom Theme files -->
<link href="css/index.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link
	href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i"
	rel="stylesheet">
	
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>Add Expense Details</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form:form action="${contextRoot}/expense" method="post"
					modelAttribute="expense">

					
					<form:input path="expensename" placeholder="Enter expense name" />
					<form:input path="amount" placeholder="Enter expense amuont" />
					<form:input path="note" placeholder="Enter note (Optional)" />
					<form:hidden path="id" />
					<!-- <input class="text" type="text" name="Username"
						placeholder="Username" required=""> 
						<input
						class="text email" type="email" name="email" placeholder="Email"
						required=""> 
						<input class="text" type="password"
						name="password" placeholder="Password" required=""> 
						<input
						class="text w3lpass" type="password" name="password"
						placeholder="Confirm Password" required=""> -->
					<!-- <div class="wthree-text">
						<label class="anim"> <input type="checkbox"
							class="checkbox" required=""> <span>I Agree To The
								Terms & Conditions</span>
						</label>
						<div class="clear"></div>
					</div> -->
					<input type="submit" value="Add Expense"/>
				</form:form>
				<!-- <p>
					Don't have an Account? <a href="#"> Login Now!</a>
				</p> -->
			<%-- 	<p>
					<a href="${contextRoot}/expense/${expense.id}/delete">Delete</a>
				</p> --%>
			</div>
		</div>
		<!-- copyright -->
		<!-- 	<div class="colorlibcopy-agile">
			<p>
				© 2018 Colorlib Signup Form. All rights reserved | Design by <a
					href="https://colorlib.com/" target="_blank">Colorlib</a>
			</p>
		</div> -->
		<!-- //copyright -->
		<!-- <ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul> -->
	</div>
	<!-- //main -->
</body>
</html>
















<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Tracker</title>
</head>
<body>
	<h1>Add Expense</h1>


	<form:form action="${contextRoot}/expense" method="post"
		modelAttribute="expense">

		<form:hidden path="id" />
		<form:input path="expensename" placeholder="Enter expense name" />
		<form:input path="amount" placeholder="Enter expense amuont" />
		<form:textarea path="note" placeholder="Enter note (Optional)" />

		<button type="submit">Add Expense</button>

	</form:form>

	<a href="${contextRoot}/expense/${expense.id}/delete">Delete</a>
</body>
</html> --%>