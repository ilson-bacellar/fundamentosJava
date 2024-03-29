<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Pacientes</title>
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
	
		<form action="/cepPaciente" class="form-inline" method="post">
		
			<label>Consultar CEP:</label> 	
			<input type="text" name="cep" value="20010020" class="form-control">

			<button type="submit" class="btn btn-default btn-sm" style="background-color:#FFAC1C; border: none; color:black; font-weight: bold; box-shadow:1px 1px 1px black">BUSCAR</button>
			
		</form>
	
		<form action="/paciente/incluir" method="post">
			<h3>Cadastro de Pacientes</h3>
		
			<div class="form-group">
				<label>Nome:</label> 	
				<input type="text" name="nome" value="Caio Lima Torres" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Telefone:</label>
				<input type="text" name="telefone" value="21333635" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Prontuário:</label>
				<input type="text" name="prontuario" value="36 anos, hipertenso" class="form-control">
			</div>
			
			<c:import url="/WEB-INF/jsp/endereco/cadastro.jsp"/>
						
			<button type="submit" class="btn btn-default" style="background-color:#FFAC1C; border: none; color:black; font-weight: bold; box-shadow:1px 1px 1px black">CADASTRAR</button>
		</form>
	</div>

</body>
</html>