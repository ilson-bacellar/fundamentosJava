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
      	background-image: radial-gradient(ellipse, #1397e3, #9eecf8);
      }
     </style>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		<form action="/paciente/incluir" method="post">
			<h3>Cadastro de Pacientes</h3>
		
			<div class="form-group">
				<label>Nome:</label> 	
				<input type="text" name="nome" value="Paulo Lima Torres" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Telefone:</label>
				<input type="text" name="telefone" value="22222222" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Prontuário:</label>
				<input type="prontuario" name="prontuario" value="36 anos, hipertenso" class="form-control">
			</div>
						
			<button type="submit">Cadastrar</button>
		</form>
	</div>

</body>
</html>