<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Pacientes</title>
</head>
<body>

	<div class="container">

		<h3>Listagem de Pacientes</h3>
		
		<form action="/paciente" method="get">
			<button type="submit">Novo</button>
		</form>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty pacientes}">
			<h5>Não existem pacientes cadastrados!</h5>
		</c:if>

		<c:if test="${not empty pacientes}">
			<h5>Quantidade de pacientes cadastrados: ${pacientes.size()}!</h5>
		</c:if>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Nome</th>
					<th>Telefone</th>
					<th>Prontuário</th>
					<th>Usuário</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${pacientes}">
					<tr>
						<td>${p.id}</td>
						<td>${p.nome}</td>
						<td>${p.telefone}</td>
						<td>${p.prontuário}</td>
						<td>${p.usuario.nome}</td>
						<td><a href="/paciente/${p.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>


</body>
</html>