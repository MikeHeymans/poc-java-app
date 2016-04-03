<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<base href="${pageContext.servletContext.contextPath}/"/>
<title>Home</title>
</head>
<body>
<p>Index Pagina</p>
<a href="/">Home</a>
<a href="/reservatie">Reservaties</a>
<a href="/materiaal">Materiaal</a>

	<table>
		<tr>
			<th>id</th>
			<th>Naam</th>
		</tr>
	<c:forEach items="${gebruikers}" var="gebruiker">
		<tr>
			<td>
				${gebruiker.id }
			</td>
			<td>
				${gebruiker.naam}
			</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>