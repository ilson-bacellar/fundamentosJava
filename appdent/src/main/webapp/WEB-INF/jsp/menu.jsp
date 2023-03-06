<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">AppDent</a>
		</div>
		
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<c:if test="${not empty usuario}">
				<li><a href="/usuario/lista">Usu�rio</a></li>
				<li><a href="#">Paciente</a></li>
				<li><a href="#">Servi�os</a></li>
				<li><a href="#">Limpeza</a></li>
				<li><a href="#">Canal</a></li>
				<li><a href="#">Ortodontia</a></li>
				<li><a href="#">Atendimento</a></li>
			</c:if>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<c:if test="${empty usuario}">
				<li><a href="/usuario"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="/login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>

			<c:if test="${not empty usuario}">
				<li><a href="/logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout,
						${usuario.nome}</a></li>
			</c:if>
		</ul>
	</div>
</nav>