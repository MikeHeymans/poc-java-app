<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Reservatie</title>
</head>
<body>
<p>Detail van reservatie</p>
<p>${reservatie.aantal}</p>
<p>${reservatie.datum}</p>
<p>${reservatie.gebruiker.naam}</p>
<a href="/">Home</a>
</body>
</html>
