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
		<form action="/servico" method="get">
			<h3>Listagem de Serviços</h3>

			<button type="submit">Novo</button>
		</form>

		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>Nome</th>
		      <th>Descrição</th>
		      <th>Valor</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <td>Limpeza</td>
		      <td>Remoção de placa e tártaro (tartarectomia, jato de bicarbonato de sódio, escovação completa e aplicação de flúor)</td>
		      <td>A partir de R$ 200,00</td>
		    </tr>
		    <tr>
		      <td>Canal</td>
		      <td>Remoção da polpa dentária</td>
		      <td>A partir de R$ 500,00</td>
		    </tr>
		    <tr>
		      <td>Ortodontia</td>
		      <td>Aparelho ortodôntico</td>
		      <td>Aparelho: 5.000,00; Manutenção: 700,00</td>
		    </tr>
		  </tbody>
		</table>		

	</div>

</body>
</html>