<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Serviços</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		<form action="/servico/incluir" method="post">
			<h3>Cadastro de Serviços</h3>
		
			<div class="form-group">
				<label>Nome:</label> 	
				<input type="text" name="nome" value="" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Descrição:</label>
				<input type="texto" name="descricao" value="" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Valor:</label>
				<input type="number" name="valor" value="" class="form-control">
			</div>
						
			<button type="submit">Cadastrar</button>
		</form>
	</div>

</body>
</html>