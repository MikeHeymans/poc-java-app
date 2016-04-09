<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri='http://www.springframework.org/tags'%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.servletContext.contextPath}/" />
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<script src="/resources/js/jquery-2.2.2.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<title>Materiaal</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/shared/menu.jsp"></c:import>
	<div class="container">
		<section>
			<div class="panel panel-default col-md-8 col-md-offset-2">
				<div class="panel-heading">
					<h3 class="panel-title">Details ${materiaal.naam}</h3>
				</div>
				<div class="panel-body">
					<p>
						<label class="col-md-4">Id</label>${materiaal.id }
					</p>
					<p>
						<label class="col-md-4">Naam</label>${materiaal.naam}
					</p>
					<p>
						<label class="col-md-4">Omschrijving</label>${materiaal.omschrijving}
					</p>
					<p>
						<label class="col-md-4">Totaal stock</label>${materiaal.aantalInStock}
					</p>
					<p>
						<label class="col-md-4">Aantal onbeschikbaar</label>${materiaal.aantalOnbeschikbaar}
					</p>
					<p>
						<label class="col-md-4">Doelgroepen</label>
						<ul>
							<c:forEach items="${materiaal.doelgroepen}" var="doelgroep">
								<li>${doelgroep.naam}</li>
							</c:forEach>
						</ul>
					</p>
					<p>
						<label class="col-md-4">Leergebieden</label>
						<ul>
							<c:forEach items="${materiaal.leergebieden}" var="leergebied">
								<li>${leergebied.naam}</li>
							</c:forEach>
						</ul>
					</p>
					<p>
						<button onclick="" class="btn btn-default">Verwijderen</button>
						<spring:url var='editUrl' value='/materiaal/edit/{id}'>
							<spring:param name='id' value='${materiaal.id}' />
						</spring:url>
						<a href="${editUrl}" class="btn btn-default">Bewerken</a>
					</p>
					
					<p id="verwijderForm">
						<spring:url var='url' value='/materiaal/delete/{id}'>
							<spring:param name='id' value='${materiaal.id}' />
						</spring:url>
						<p>U staat op het punt om ${materiaal.naam} te verwijderen, weet u dit zeker?<br/>
							Deze actie is onomkeerbaar
						</p>
						<form method="post" action="${url}">
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
							<input type="submit" value="verwijderen" class="btn btn-warning">
						</form>					
					</p>
				</div>
			</div>
		</section>
	</div>
</body>
</html>