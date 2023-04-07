<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Atendimentos</title>
	<style>
      body {
      	background-image: radial-gradient(ellipse, #1397e3, #9eecf8);
      }
     </style>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<h3>Listagem de Atendimentos</h3>
		
		<form action="/atendimento" method="get">
			<button type="submit">Novo</button>
		</form>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty atendimentos}">
			<h5>Não existem atendimentos cadastrados!</h5>
		</c:if>

		<c:if test="${not empty atendimentos}">
			<h5>Quantidade de atendimentos cadastrados: ${atendimentos.size()}!</h5>
		</c:if>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Data</th>
					<th>Pagamento</th>
					<th>Observações</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${atendimentos}">
					<tr>
						<td>${a.id}</td>
						<td>${a.data}</td>
						<td>${a.pagamento}</td>
						<td>${a.obs}</td>
						<td><a href="/atendimento/${a.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>