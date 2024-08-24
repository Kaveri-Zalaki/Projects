<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type = "text/css">
 span{
 display: inline-block;
 width: 200px;
 text-align: left;}
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
		<h2>Registration Succeeded!</h2>
		<span>First Name:</span><span>${register.firstName}</span><br/>
		<span>Last Name:</span><span>${register.lastName}</span><br/>
		
		</div>
</body>
</html>