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
		<form action="/limpeza" method="get">
			<h3>Listagem de Servi�os de Limpeza</h3>

			<button type="submit">Novo</button>
		</form>

		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>Nome</th>
		      <th>Descri��o</th>
		      <th>Valor</th>
		    </tr>
		  </thead>
		  <tbody>
		   <tr>
		      <td>Limpeza</td>
		      <td>Com jato de bicarbonato de s�dio e aplica��o de fl�or</td>
		      <td>300,00</td>
		    </tr>
		    <tr>
		      <td>Limpeza</td>
		      <td>Remo��o de t�rtaro e aplica��o de fl�or</td>
		      <td>500,00</td>
		    </tr>
		    <tr>
		      <td>Limpeza</td>
		      <td>Escova��o completa e aplica��o de fl�or</td>
		      <td>400,00</td>
		    </tr>
		  </tbody>
		</table>		

	</div>

</body>
</html>