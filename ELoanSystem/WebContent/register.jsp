<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
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
	<h2>eLoan Registration</h2>
	<div>
	<c:if test="${err!=null }">
			<p><strong>${err }</strong></p>
		</c:if>
		<script>
		function check_pass() {
    if (document.getElementById('password').value ==
            document.getElementById('confirmpassword').value) {
        document.getElementById('submit').disabled = false;
    } else {
        document.getElementById('submit').disabled = true;
        window.alert("Passwords do not match");
    }
    
}
		</script>
	
	<form action="registernewuser" method="post">
		<div>
			<div><label for="username">Enter user name</label> </div>
			<div><input type="text" id="username" name="unm" required /> </div>
		</div>
		<div>
		<div><label for="password">Enter password  </label> </div>
			<div><input type="password" id="password" name="pwd"  onchange='check_pass();'/> </div>
		</div>
		<div>
		<div><label for="confimrpwd">Re-enter password  </label> </div>
			<div><input type="password" id="confirmpassword" name="cpwd"  onchange='check_pass();' /> </div>
		</div>
		
		<br>
		<div>
			<div><input type="submit" value="Sign Up" id = "submit" disabled /> </div>
		</div>

	</form>
	</div>
	</div>
	

 <jsp:include page="footer.jsp"/>
</body>
</html>