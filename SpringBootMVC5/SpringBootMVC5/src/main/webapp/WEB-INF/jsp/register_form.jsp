<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix ="form" uri = "http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type ="text/css">
button{
padding: 10px;
}

.error{
color:red;
font-style:italic;}

form{
display:table;
}
form div{
display: table-row;
}

label,input,span,select{
display: table-cell;
margin: 5px;
text-align: left;}

input[type=text], input[type=password], select, textarea,input[type=date]{
width: 200px;
margin: 5px;}

form div div{
display: table-cell;}

.background {
	background: #5f726c;
	padding: 4em 0;
}


body {
    padding: 0;
    margin: 0;
    background: #f2f6e9;
}



</style>

</head>
<body>
<div align="center">
		<h2>JOSAA Registration Form</h2>
		<form:form action="register" method="post" modelAttribute="register" >
             <div>
			<form:label path="firstName" class="form-control">First name:</form:label>
			<form:input path="firstName" />
			<form:errors path="firstName" cssClass="error" />
			</div>
			
			<div >
			<form:label path="lastName">Last name:</form:label>
			<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
			</div>
			
			<div>
				<div></div>
				<div>
				<form:button>Register</form:button>
				</div>
				<div></div>
				</div>
				
			</form:form>
			</div>

</body>
</html>