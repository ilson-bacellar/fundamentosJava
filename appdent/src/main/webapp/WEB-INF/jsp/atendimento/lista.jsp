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
      	background-image: radial-gradient(ellipse, #1397e3, #056abd);
      	color: white;
       	text-shadow: 1px 1px 1px black;
      }
     </style>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<h3>Listagem de Atendimentos</h3>
		
		<form action="/atendimento" method="get">
			<button type="submit" class="btn btn-default" style="background-color:#FFAC1C; border: none; color:black; font-weight: bold; box-shadow:1px 1px 1px black">NOVO</button>
		</form>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Aten��o!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty atendimentos}">
			<h5>N�o existem atendimentos cadastrados!</h5>
		</c:if>

		<c:if test="${not empty atendimentos}">
			<h5>Quantidade de atendimentos cadastrados: ${atendimentos.size()}!</h5>
		</c:if>

		<table class="table">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Data</th>
					<th>Pagamento</th>
					<th>Observa��es</th>
					<th>Paciente</th>
					<th>Quantidade de Servi�os</th>
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
						<td>${a.paciente.nome}</td>
						<td>${a.servicos.size()}</td>
						<td><a href="/atendimento/${a.id}/excluir" style="color:#FFAC1C">EXCLUIR</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>