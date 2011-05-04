<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/lib/struts-html.tld" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login Form</title>
</head>
<body>
<html:errors/>
<html:form action="/employeeLoginAction.do">
Employee Username: <html:text property="employeeName"></html:text>
Employee Password: <html:text property="employeePwd"></html:text>
	<html:submit property="submit"></html:submit>
</html:form>
</body>
</html>