<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Application Form</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body onload="myFunction()">

<!--
	write the html code to accept laon info from user and send to placeloan servlet
-->

</script>
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

<a href="userhome1.jsp">Loan Info</a> <span>|</span>
<a href="application.jsp">Apply loan</a> <span>|</span>
<a href="trackloan.jsp">Track Loan</a> <span>|</span>
<a href="editloan.jsp">Edit Loan</a>
<hr>
<div align="right"><a href="index.jsp">Logout</a></div>
	
    </head>
	
	<h2>Loan Application </h2>
		<form action="placeloan" method="post">
		<div>
			<div><label for="purpose">Loan purpose</label> </div>
			<div><input type="text" name="purpose" value="${loanInfo.purpose }"> </div>
		</div>
		
		<div>
			<div><label for="amtrequest">Amount Requested</label> </div>
			<div><input type="number" name="amtrequest" min=10000  value="${loanInfo.amtrequest }"> </div>
		</div>
		<div>
			<div><label for="doa">Date of Application</label> </div>
			<div><input type="date" name="doa" value="${loanInfo.doa }"> </div>
		</div>
		<div>
			<div><label for="bstructure">Business Structure</label> </div>
			<div><select id="bstructure" name="bstructure">
			  <option value=""></option>
			  <option value="individual">Individual</option>
			  <option value="organization">Organization</option>
			</select> </div>
		</div>
		<div>
			<div><label for="bindicator">Billing Indicator</label> </div>
			<div><select id="bindicator" name="bindicator">
			  <option value=""></option>
			  <option value="salaried">Salaried</option>
			  <option value="notsalaried">Not Salaried</option>
			</select> </div>
		</div>
		<div>
			<div><label for="tindicator">Tax Indicator</label> </div>
			<div><select id="bindicator" name="tindicator">
			  <option value=""></option>
			  <option value="Tax Payer">Tax Payer</option>
			  <option value="Non Tax Payer">Non Tax Payer</option>
			</select> </div>
		</div>
		<div>
			<div><label for="address">Address </label> </div>
			<div><input type="text" id="address" name="address" value="${loanInfo.address }"> </div>
		</div>
		<div>
			<div><label for="email">Email Address </label> </div>
			<div><input type="text" id="email" name="email" value="${loanInfo.email }"> </div>
		</div>
		<div>
			<div><label for="mobile">Mobile Number </label> </div>
			<div><input type="text" id="mobile" name="mobile" value="${loanInfo.mobile }"> </div>
		</div>
		<br>
		<div>
			<button>Submit</button>
		</div>
		
		<c:if test="${err!=null }">
			<p><strong>${err}</strong></p>
		</c:if>
<jsp:include page="footer.jsp"/>
</form>
</script>


</body>
</html>
