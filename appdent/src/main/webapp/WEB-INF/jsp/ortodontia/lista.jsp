<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Serviços de Ortodontia</title>
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

		<h3>Listagem de Serviços de Ortodontia</h3>
		
		<form action="/ortodontia" method="get">
			<button type="submit" class="btn btn-default" style="background-color:#FFAC1C; color:black; font-weight: bold; box-shadow:1px 1px 1px black">NOVO</button>
		</form>
		
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

		<table class="table">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Nome</th>
					<th>Descrição</th>
					<th>Valor</th>
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
						<td>${o.nome}</td>
						<td>${o.descricao}</td>
						<td>${o.valor}</td>
						<td>${o.manutencao}</td>
						<td>${o.duracaoEmMeses}</td>
						<td>${o.microimplante}</td>
						<td><a href="/ortodontia/${o.id}/excluir" style="color:#FFAC1C">EXCLUIR</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>