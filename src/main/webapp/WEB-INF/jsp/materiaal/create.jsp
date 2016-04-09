<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.servletContext.contextPath}/" />
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<script src="/resources/js/jquery-2.2.2.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<title>Materiaal toevoegen</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/shared/menu.jsp"></c:import>
	<div class="container">
		<form:form class="form-horizontal" method="post" action="/materiaal"
			commandName="materiaal">
			<div class="form-group">
				<label class="col-sm-2 control-label">Naam</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="naam"
						placeholder="Naam" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Omschrijving</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="omschrijving"
						placeholder="omschrijving" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Artikel nummer</label>
				<div class="col-sm-10">
					<form:input type="text" class="form-control" path="artikelNr"
						placeholder="Artikel nummer" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Prijs</label>
				<div class="col-sm-10">
					<form:input type="currency" class="form-control" path="prijs"
						placeholder="Prijs" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Uitleenbaar</label>
				<div class="col-sm-10">
					<form:checkbox path="isUitleenbaar" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Aantal in stock</label>
				<div class="col-sm-10">
					<form:input type="number" class="form-control" path="aantalInStock"
						placeholder="aantal In Stock" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Aantal onbeschikbaar</label>
				<div class="col-sm-10">
					<form:input type="number" class="form-control"
						path="aantalOnbeschikbaar" placeholder="aantal onbeschikbaar" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Doelgroepen</label>
				<div class="col-sm-10">
					<form:checkboxes items="${doelgroepen}" path="doelgroepen"
						itemLabel="naam" itemValue="id" delimiter="<br/>" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Leergebieden</label>
				<div class="col-sm-10">
					<form:checkboxes items="${leergebieden}" path="leergebieden"
						itemLabel="naam" itemValue="id" delimiter="<br/>" />
				</div>
			</div>
			<div class="form-group">
				<form:input type="hidden" class="form-control" path="id"
					value="${materiaal.id}" />
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-default" value="Opslaan" />
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>