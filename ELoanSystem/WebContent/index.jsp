<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
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
<div align=left>
	<h2>eLoan Login</h2>
	<c:if test="${err!=null }">
			<p><strong>${err }</strong></p>
		</c:if>
	<form action="validate" method="post">
		<div>
			<div><label for="loginid">Enter user name</label> </div>
			<div><input type="text" id="loginid" name="unm" required /> </div>
		</div>
		
		<div>
			<div><label for="password">Enter password</label> </div>
			<div><input type="password" id="password" name="pwd" required /> </div>
		</div>
		<div>
		<br>
			<div><input type="submit" value="Login"> </div>
		</div>
		<br>
		<a href = "register.jsp">New User? Click here</a>
	</form>
	</div>
<br>
<br>
<br>
<jsp:include page="footer.jsp"/>
</body>
</html>