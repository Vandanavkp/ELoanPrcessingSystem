<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- write the code to read application number, and send it to admincontrollers
	     callemi method to calculate the emi and other details also provide links
	     to logout and admin home page
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
<a href="adminhome1.jsp">Loan Info</a> <span>|</span>
<a href="listall.jsp">List all loans</a> <span>|</span>
<a href="process.jsp">Process loan</a> <span>|</span>
<a href="calemi.jsp">Calculate emi</a>
<hr>
<div align="right"><a href="index.jsp">Logout</a></div>
	
	<h2> Process loan </h2>
		<form action="process" method="post">
		<div>
			<div><label for="processloan">Enter loan application ID : </label> </div>
			<div><input type="text" name="processloan" value="${loanInfo.applno }"> </div>
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
<br></br>
<br></br>
<jsp:include page="footer.jsp"/>

</body>
</html>