<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Serviços de Ortodontia</title>
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
		<form action="/ortodontia/incluir" method="post">
			<h3>Cadastro de Serviços de Ortodontia</h3>
		
			<c:import url="/WEB-INF/jsp/servico/cadastro.jsp" />
			
			<div class="form-group">
				<label>Manutenção:</label>
				<input type="number" name="manutencao" value="700" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Duração (em meses):</label>
				<input type="number" name="duracao" value="36" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Microimplante:</label>
				<!-- <input type="radio" name="microimplante" value="false" class="form-control"> --> 
				<div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="microimplante" value="true" class="form-check-input" >
			      </label>
			    </div>
			</div>
						
			<button type="submit" class="btn btn-default" style="background-color:#FFAC1C; color:black; font-weight: bold; box-shadow:1px 1px 1px black">CADASTRAR</button>
		</form>
	</div>

</body>
</html>