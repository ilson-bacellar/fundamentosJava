<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Servi�os de Limpeza</title>
</head>
<body>

	<div class="container">

		<h3>Listagem de Servi�os de Limpeza</h3>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Aten��o!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty limpezas}">
			<h5>N�o existem servi�os de limpeza cadastrados!</h5>
		</c:if>

		<c:if test="${not empty limpezas}">
			<h5>Quantidade de servi�os de limpeza cadastrados: ${limpezas.size()}!</h5>
		</c:if>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Dessensibiliza��o</th>
					<th>Clareamento</th>
					<th>Periodontia</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="l" items="${limpezas}">
					<tr>
						<td>${l.id}</td>
						<td>${l.dessensibilizacao}</td>
						<td>${l.clareamento}</td>
						<td>${l.periodontia}</td>
						<td><a href="/limpeza/${l.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>