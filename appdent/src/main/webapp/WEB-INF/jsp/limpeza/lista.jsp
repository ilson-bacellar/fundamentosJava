<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Serviços de Limpeza</title>
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

		<h3>Listagem de Serviços de Limpeza</h3>
		
		<form action="/limpeza" method="get">
			<button type="submit" class="btn btn-default" style="background-color:#FFAC1C; border: none; color:black; font-weight: bold; box-shadow:1px 1px 1px black">NOVO</button>
		</form>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty limpezas}">
			<h5>Não existem serviços de limpeza cadastrados!</h5>
		</c:if>

		<c:if test="${not empty limpezas}">
			<h5>Quantidade de serviços de limpeza cadastrados: ${limpezas.size()}!</h5>
		</c:if>

		<table class="table">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Nome</th>
					<th>Descrição</th>
					<th>Valor</th>
					<th>Dessensibilização</th>
					<th>Clareamento</th>
					<th>Periodontia</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="l" items="${limpezas}">
					<tr>
						<td>${l.id}</td>
						<td>${l.nome}</td>
						<td>${l.descricao}</td>
						<td>${l.valor}</td>
						<td>${l.dessensibilizacao}</td>
						<td>${l.clareamento}</td>
						<td>${l.periodontia}</td>
						<td><a href="/limpeza/${l.id}/excluir" style="color:#FFAC1C">EXCLUIR</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>