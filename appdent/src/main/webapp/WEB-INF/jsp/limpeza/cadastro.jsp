<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Serviços de Limpeza</title>
	<style>
      body {
      	background-image: radial-gradient(ellipse, #1397e3, #9eecf8);
      }
     </style>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		<form action="/limpeza/incluir" method="post">
			<h3>Cadastro de Serviços de Limpeza</h3>
		
			<div class="form-group">
				<label>Nome:</label> 	
				<input type="text" name="nome" value="Limpeza" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Descrição:</label>
				<input type="text" name="descricao" value="Jato de bicarbonato" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Valor:</label>
				<input type="number" name="valor" value="200" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Dessensibilização:</label>
				<!--  <input type="radio" name="dessensibilizacao" value="false" class="form-control"> --> 
				 <div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="dessensibilizacao" value="true" class="form-check-input" >
			      </label>
			    </div>
			</div>
			
			<div class="form-group">
				<label>Clareamento:</label>
			<!--	<input type="radio" name="clareamento" value="false" class="form-control"> --> 
				<div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="clareamento" value="true" class="form-check-input" >
			      </label>
			    </div>
			</div>
			
			<div class="form-group">
				<label>Periodontia:</label>
				<!--	<input type="radio" name="periodontia" value="false" class="form-control"> --> 
				<div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="periodontia" value="true" class="form-check-input" >
			      </label>
			    </div>
			</div>
						
			<button type="submit">Cadastrar</button>
		</form>
	</div>	

</body>
</html>