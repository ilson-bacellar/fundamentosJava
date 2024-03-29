<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Servi�os de Canal</title>
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

		<h3>Listagem de Servi�os de Canal</h3>
		
		<form action="/canal" method="get">
			<button type="submit" class="btn btn-default" style="background-color:#FFAC1C; border: none; color:black; font-weight: bold; box-shadow:1px 1px 1px black"">NOVO</button>
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

		<table class="table">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Nome</th>
					<th>Descri��o</th>
					<th>Valor</th>
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
						<td>${c.nome}</td>
						<td>${c.descricao}</td>
						<td>${c.valor}</td>
						<td>${c.numeroSessoes}</td>
						<td>${c.tipoRestauracao}</td>
						<td>${c.tipoCoroa}</td>
						<td><a href="/canal/${c.id}/excluir" style="color:#FFAC1C">EXCLUIR</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	
</body>
</html>