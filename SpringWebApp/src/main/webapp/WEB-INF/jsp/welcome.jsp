<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    
<html>
<body>
<h2>LOGIN PAGE</h2>
<form:form action="login" method="post" modelAttribute="user">
<form:input path="userId" />
<form:input path="pwd" />
<form:button>Login</form:button>

</form:form>

</body>
</html>  