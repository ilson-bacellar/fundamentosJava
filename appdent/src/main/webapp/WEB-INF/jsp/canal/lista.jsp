<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Servi�os de Canal</title>
</head>
<body>

		<c:import url="/WEB-INF/jsp/menu.jsp" />

		<div class="container">

		<h3>Listagem de Servi�os de Canal</h3>
		
		<form action="/canal" method="get">
			<button type="submit">Novo</button>
		</form>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Aten��o!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty canais}">
			<h5>N�o existem servi�os de canal cadastrados!</h5>
		</c:if>

		<c:if test="${not empty canais}">
			<h5>Quantidade de servi�os de canal cadastrados: ${canais.size()}!</h5>
		</c:if>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>N�mero de sess�es</th>
					<th>Tipo de restaura��o</th>
					<th>Tipo de coroa</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${canais}">
					<tr>
						<td>${c.id}</td>
						<td>${c.numeroSessoes}</td>
						<td>${c.tipoRestauracao}</td>
						<td>${c.tipoCoroa}</td>
						<td><a href="/canal/${c.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	
</body>
</html>