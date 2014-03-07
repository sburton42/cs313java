<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scripture List</title>
</head>
<body>

<div>
	Scripture List<br /><br />

	<c:forEach items="${scriptures}" var="scripture">
	
		<strong>${scripture.book}</strong> ${scripture.chapter}:${scripture.verse}<br />
	</c:forEach>

	<c:forEach items="${scriptures}" var="scripture">
	
		${scripture}<br />
	</c:forEach>
</div>

</body>
</html>