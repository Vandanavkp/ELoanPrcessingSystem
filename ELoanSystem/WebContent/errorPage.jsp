<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error page </title>
</head>
<body>
<jsp:include page="header.jsp"/>
<br>
<br>
<br>
<br>
<br>
<br>

<hr>
<nav>
<a href="index.jsp">Login</a>
<span>|</span>
<a href="register.jsp">Register</a>

</nav>
<hr />
			<h3>Error Occurred</h3>
		<ul>
			<li>The below Error occurred while processing your request.</li>
			<li>Kindly follow the message and request again.</li>
			<li>If error persists contact admin.</li>
			<li>Inconvenience Regretted!</li>
		</ul>
		
		<p><strong>Error: ${err }</strong></p>
	</body>
</html>
<br>
<br>
<br>
	<jsp:include page="footer.jsp"/>
</body>
</html>