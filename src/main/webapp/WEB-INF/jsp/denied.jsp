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
				<h3 class="panel-title">Oh o!</h3>
			</div>
			<div class="panel-body">U hebt geen rechten om deze content te zien =(</div>
		</div>
	</div>
</body>
</html>