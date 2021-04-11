<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<s:form action="/authn/authentication">
    	  <s:textfield name="authnRequest.userName" label="Username"/>
    	  <s:password name="authnRequest.password" label="Password"/>
    	  <s:submit/>
		</s:form>
	</body>
</html>