<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Loan</title>
</head>

	<!-- write html code to read the application number and send to usercontrollers'
             displaystatus method for displaying the information
	-->
<jsp:include page="header.jsp"/>
	<br>
<br>
<br>
<br>
<br>
<br>
<hr>
</head>
<body>
<nav>
<a href="userhome1.jsp">Loan Info</a> <span>|</span>
<a href="application.jsp">Apply loan</a> <span>|</span>
<a href="trackloan.jsp">Track Loan</a> <span>|</span>
<a href="editloan.jsp">Edit Loan</a>

</nav>
<hr>
<div align="right"><a href="index.jsp">Logout</a></div>
	
	<h2>Edit Loan </h2>
		<form action="editloan" method="post">
		<div>
			<div><label for="editloan">Enter loan application ID :</label> </div>
						<div><input type="text" name="editloan" value="${loanInfo.applno }"> </div>
		</div>
		<div>
		<br>
			<button >Submit</button>
		</div>

<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>

<jsp:include page="footer.jsp"/>

</body>
</html>