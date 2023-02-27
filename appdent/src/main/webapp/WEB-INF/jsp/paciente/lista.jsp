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
		<form action="/paciente" method="get">
			<h3>Listagem de Pacientes</h3>

			<button type="submit">Novo</button>
		</form>

		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>Nome</th>
		      <th>Telefone</th>
		      <th>Prontuário</th>
		      <th>Serviços</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <td>Cláudia Tavares Cunha</td>
		      <td>2222-2222</td>
		      <td>37 anos. Canal primeiro molar inferior esquerdo em 2022.</td>
		    </tr>
		    <tr>
		      <td>José Carvalho Bastos</td>
		      <td>3333-3333</td>
		      <td>46 anos. Cardíaco. Clareamento em 2019.</td>
		    </tr>
		    <tr>
		      <td>Paulo Silva Dias </td>
		      <td>4444-4444</td>
		      <td>27 anos. Sobremordida. Aparelho ortodôntico desde 2018.</td>
		    </tr>
		  </tbody>
		</table>		

	</div>

</body>
</html>