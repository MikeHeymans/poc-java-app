<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<div class="panel panel-default col-md-8 col-md-offset-2">
			<div class="panel-heading">
				<h3 class="panel-title">Welcome !</h3>
			</div>
			<div class="panel-body">Dit is een poc ter voorbereiding voor het java luik van het project. Authenticatie zit er (nog) niet in
			, het kan zijn dat ik dat er later nog insteek. Werken met partials zou ook nog een nice-to-have zijn maar geen idee hoe dat moet of het zelfs kan ;)</div>
		</div>
		<div class="panel panel-default col-md-8 col-md-offset-2">
			<div class="panel-heading">
				<h3 class="panel-title">De gekende gebruikers</h3>
			</div>
			<div class="panel-body">
				<c:forEach var="gebruiker" items="${gebruikers}">
					<p><label class="col-md-4">Gebruiker ${gebruiker.id}:</label>${gebruiker.naam}</p>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>