<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>AppDent</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		
		<h3>Listagem de Usuários</h3>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> %{mensagem}
			</div>
		</c:if>
		
		<c:if test="${empty usuarios}">
			<h5>Não existem usuários cadastrados!!!</h5>
		</c:if>
		
		<c:if test="${not empty usuarios}">
			<h5>Quantidade de usuários cadastrados: ${usuarios.size()}!!!</h5>

		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>Nome</th>
		      <th>Senha</th>
		      <th>E-mail</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <td>Ilson de Bacellar</td>
		      <td>123</td>
		      <td>ilson@al.infnet.edu.br</td>
		    </tr>
		    <tr>
		      <td>Ilson de Bacellar</td>
		      <td>123</td>
		      <td>ilson@al.infnet.edu.br</td>
		    </tr>
		    <tr>
		      <td>Ilson de Bacellar</td>
		      <td>123</td>
		      <td>ilson@al.infnet.edu.br</td>
		    </tr>
		  </tbody>
		</table>		

	</div>

</body>
</html>