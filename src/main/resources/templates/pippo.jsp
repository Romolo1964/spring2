<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>so un grande</h1>
<ul>
        <c:forEach items="${message}" var="actor">
            <li>${actor.nome}</li> <!-- Supponendo che il nome dell'attore sia un campo "name" -->
        </c:forEach>
    </ul>
</body>

</html>