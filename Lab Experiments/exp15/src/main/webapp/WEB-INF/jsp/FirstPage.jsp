<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FirstPage</title>
</head>
<style>

    body
    {
    	background-image: url('C:/Users/Zaid Hasan Khan/Desktop/html&css/back.jpg');
    	background-repeat: no-repeat;
 		background-size: 1550px 750px;
    } 

	h1{
		text-align: center;
		font-size: 50px;
		font-style: italic;
	}
	
	h5 {
		color: black; 
		font-size: 30px;
	}

	footer
	{
		 position: fixed;
  		left: 0;
 	 	bottom: 0;
  		width: 100%;
  		background-color: red;
  		color: white;
  		text-align: center;	}
  	.error
  	{
  		color:red;
  	}
</style>
<body>
	<h1>SIGNUP PAGE</h1>
	<form:form action="signup" method="post" modelAttribute="user">
	Input Name : <form:input path="Name"/><br>
	<form:errors path="Name" cssClass="error" />
	<br>
	
	Input CourseCode : <form:input path="Coursecode"/><br>
	<form:errors path ="Coursecode" cssClass="error"/>
	
	<br>
	
	Gender : 
	Male <form:radiobutton path="Gender" value ="Male" />
	Female <form:radiobutton path="Gender" value ="Female" /><br>
	<form:errors path="Gender" cssClass="error" />
	<br>
	
	Input Age : <form:input path="Age"/><br>
	<form:errors path="Age" cssClass="error" />	
	<br>
	
	
	Input Email : <form:input path="Email"/><br>
	<form:errors path="Email" cssClass="error" />
	<br>
	
	
	Input Phone Number : <form:input path="PhoneNo"/><br>
	<form:errors path="PhoneNo" cssClass="error" />
	
	<br>
	
	Input Password : <form:password path="Password"/><br>
	<form:errors path="Password" cssClass="error" />

	<br>

	Select City
		
	<form:select path="Cities">
	<form:option value="Gurgaon" label="Gurgaon"></form:option>
	<form:option value="Delhi" label = "Delhi"></form:option>
	<form:option value="Faridabad" label="Faridabad"></form:option>
	</form:select><br>
	<form:errors path="Cities" cssClass="error" />
	<form:button>SIGNUP</form:button>
	</form:form>

	<footer>This page is designed by ZAID KHAN</footer>
	
</body>
</html>