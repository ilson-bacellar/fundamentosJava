<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Serviços de Ortodontia</title>
</head>
<body>

		<div class="container">

		<h3>Listagem de Serviços de Ortodontia</h3>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty ortodontias}">
			<h5>Não existem serviços de ortodontia cadastrados!</h5>
		</c:if>

		<c:if test="${not empty ortodontias}">
			<h5>Quantidade de serviços de ortodontia cadastrados: ${ortodontias.size()}!</h5>
		</c:if>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Manutencao</th>
					<th>Duração (em meses)</th>
					<th>Microimplante</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="o" items="${ortodontias}">
					<tr>
						<td>${o.id}</td>
						<td>${o.manutencao}</td>
						<td>${o.duracaoEmMeses}</td>
						<td>${o.microimplante}</td>
						<td><a href="/ortodontia/${o.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>