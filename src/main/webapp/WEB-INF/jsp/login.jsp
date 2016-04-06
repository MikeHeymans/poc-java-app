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
		<form action="/login" method="post">
			<div class="form-group">
				<label class="sr-only" for="username">Gebruikersnaam</label> 
				<input type="text" class="form-control" id="username" placeholder="Gebruikersnaam" name="username">
			</div>
			<div class="form-group">
				<label class="sr-only" for="password">Password</label>
				<input type="password" class="form-control"	id="password" name="password" placeholder="Password">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<button type="submit" class="btn btn-default">Login</button>
		</form>
	</div>
</body>
</html>