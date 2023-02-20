<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>AppDent</title>
</head>
<body>

<div class="container">
		<form action="/usuario" method="get">
			<h3>Listagem de Usuários</h3>

			<button type="submit">Novo</button>
		</form>

		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>Nome</th>
		      <th>Senha</th>
		      <th>E-mail</th>
		      <th>Características</th>
		      <th>Tipo</th>
		      <th>Setor</th>
		      <th>Idade</th>
		      <th>Salário</th>
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