<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Usuários</title>
	<style>
      body {
      	background-image: radial-gradient(ellipse, #1397e3, #056abd);
      	color: white;
       	text-shadow: 1px 1px 1px black;
      }
     </style>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">

		<h3>Listagem de Usuários</h3>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty usuarios}">
			<h5>Não existem usuários cadastrados!</h5>
		</c:if>

		<c:if test="${not empty usuarios}">
			<h5>Quantidade de usuários cadastrados: ${usuarios.size()}!</h5>
		</c:if>

		<table class="table">
			<thead>
				<tr>
					<th>Identificador</th>
					<th>Nome</th>
					<th>Senha</th>
					<th>E-mail</th>
					<th>Admin</th>
					<th>Endereço</th>
					<th>Pacientes cadastrados</th>
					<th>Serviços cadastrados</th>
					<th>Atendimentos cadastrados</th>
					<c:if test="${usuario.admin}">
						<th></th>
					</c:if>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${usuarios}">
					<tr>
						<td>${u.id}</td>
						<td>${u.nome}</td>
						<td>${u.senha}</td>
						<td>${u.email}</td>
						<td>${u.admin}</td>
						<td>${u.endereco}</td>
						<td>${u.pacientes.size()}</td>
						<td>${u.servicos.size()}</td>
						<td>${u.atendimentos.size()}</td>
						<c:if test="${usuario.admin}">
							<td><a href="/usuario/${u.id}/excluir" style="color:#FFAC1C">EXCLUIR</a></td>
						</c:if>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>