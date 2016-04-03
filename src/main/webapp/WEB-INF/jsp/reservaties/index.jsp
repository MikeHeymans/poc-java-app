<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri='http://www.springframework.org/tags'%>
<!DOCTYPE html>
<html>
<head>
	<base href="${pageContext.servletContext.contextPath}/" />
	<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
	<script src="/resources/js/jquery-2.2.2.min.js"></script>
	<script src="/resources/js/bootstrap.min.js"></script>
	<title>Home</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/shared/menu.jsp"></c:import>
	<div class="container">
	<table class="table">
		<tr>
			<th>id</th>
			<th>Gebruiker</th>
			<th>Materiaal</th>
			<th>Aantal</th>
			<th>Datum</th>
			<th></th>
		</tr>
	<c:forEach items="${reservaties}" var="reservatie">
	<spring:url var='url' value='/reservatie/{id}'>
		<spring:param name='id' value='${reservatie.id}'/>
	</spring:url>
		<tr>
			<td>
				<a href='${url}'>Reservatie ${reservatie.id}</a>
			</td>
			<td>
				${reservatie.gebruiker.naam}
			</td>
			<td>
				${reservatie.materiaal.naam}
			</td>
			<td>
				${reservatie.aantal}
			</td>
			<td>
				${reservatie.datum}
			</td>
			<td>
			</td>
		</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>