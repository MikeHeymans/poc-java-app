<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<base href="${pageContext.servletContext.contextPath}/" />
	<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
	<script src="/resources/js/jquery-2.2.2.min.js"></script>
	<script src="/resources/js/bootstrap.min.js"></script>
	<title>Reservatie</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/shared/menu.jsp"></c:import>
	<div class="container">
		<div class="panel panel-default col-md-6 col-md-offset-3">
			<div class="panel-heading">
				<h3 class="panel-title">Details van reservatie ${reservatie.id}</h3>
			</div>
			<div class="panel-body">
				<p><label class="col-md-5">Aantal:</label>${reservatie.aantal}</p>
				<p><label class="col-md-5">Materiaal:</label>${reservatie.materiaal.naam}</p>
				<p><label class="col-md-5">Gebruiker:</label>${reservatie.gebruiker.naam}</p>
				<p><label class="col-md-5">Datum:</label>${reservatie.datum}</p>
			</div>
		</div>
	</div>
</body>
</html>
