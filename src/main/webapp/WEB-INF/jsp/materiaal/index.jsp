<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
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
<form:form action="/materiaal" commandName="searchValue" method="get">
	<form:input path="query" autofocus="true"/>
	<input type="submit" value="zoek"/>
</form:form>	
	<table class="table">
		<tr>
			<th class="col-xs-1">id</th>
			<th class="col-xs-2">Naam</th>
			<th class="col-xs-8">Omschrijving</th>
			<th class="col-xs-1">Aantal in stock</th>
		</tr>
	<c:forEach items="${materialen}" var="materiaal">
		<tr>
			<td>
				${materiaal.id }
			</td>
			<td>
				${materiaal.naam}
			</td>
			<td>
				${materiaal.omschrijving}	
			</td>
			<td>
				${materiaal.aantalInStock}
			</td>
		</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>