<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring i18n</title>
</head>
<body>

Language: <a href="?language=en">English</a> <a href="?language=fr">French</a> <a href="?language=hi">Hindi</a>

<h1>
<spring:message code="student.title" />
</h1>

<form:form>
<table>
fjhhhhhhhhhhhhhhf
<tr>
<td>
<spring:message code="student.id" />
</td>
</tr>

<tr>
<td>
<spring:message code="student.firstName" />
</td>
</tr>

<tr>
<td>
<spring:message code="student.lastName" />
</td>
</tr>

</table>
</form:form>
</body>
</html>