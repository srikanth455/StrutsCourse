<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/lib/struts-html.tld" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hcl Login </title>
</head>
<body>
<html:form action="/hclLoginAction.do">
Employee Username: <html:text property="hclEmpName"></html:text>
Employee Password: <html:text property="hclEmpPwd"></html:text>
	<html:submit property="submit"></html:submit>
</html:form>
</body>
</html>