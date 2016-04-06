<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div class="navbar navbar-default">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/">Leermiddelen</a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<!--  fix this
				<sec:authorize url="/reservatie">
					<li><a href="/reservatie" id="reservatie">Reservaties</a></li>
				</sec:authorize>
				<sec:authorize url="/materiaal"> 
					<li><a href="/materiaal" id="materiaal">Materiaal</a></li>
				</sec:authorize>
				-->
				
					<li><a href="/materiaal" id="materiaal">Materiaal</a></li>
					<li><a href="/reservatie" id="reservatie">Reservaties</a></li>
			</ul>
			<sec:authorize access="isAuthenticated()">
			<form class="navbar-form navbar-right" action="/logout" method="post">
				<label>Ingelogd als <sec:authentication property="principal.username" /></label>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					<button type="submit" class="btn btn-default">Logout</button>
				</form>
			</sec:authorize>
			<sec:authorize access="isAnonymous()">
				<form class="navbar-form navbar-right" action="/login" method="get">
					<button type="submit" class="btn btn-default">Login</button>
				</form>
			</sec:authorize>
		</div>
	</div>
</div>