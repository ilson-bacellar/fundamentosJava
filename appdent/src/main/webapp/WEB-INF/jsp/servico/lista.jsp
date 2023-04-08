<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Serviços</title>
	<style>
      body {
      	background-image: radial-gradient(ellipse, #1397e3, #9eecf8);
      }
     </style>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<h3>Listagem de Serviços</h3>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty servicos}">
			<h5>Não existem serviços cadastrados!</h5>
		</c:if>

		<c:if test="${not empty servicos}">
			<h5>Quantidade de serviços cadastrados: ${servicos.size()}!</h5>
		</c:if>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Nome</th>
					<th>Descrição</th>
					<th>Valor</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="s" items="${servicos}">
					<tr>
						<td>${s.id}</td>
						<td>${s.nome}</td>
						<td>${s.descricao}</td>
						<td>${s.valor}</td>
						<td><a href="/servico/${s.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>