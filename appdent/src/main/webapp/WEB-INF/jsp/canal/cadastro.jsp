<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Servi�os de Canal</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		<form action="/canal/incluir" method="post">
			<h3>Cadastro de Servi�os de Canal</h3>
		
			<div class="form-group">
				<label>Nome:</label> 	
				<input type="text" name="nome" value="Canal" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Descri��o:</label>
				<input type="texto" name="descricao" value="Pr�-molar inferior direito" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Valor:</label>
				<input type="number" name="valor" value="1000,00" class="form-control">
			</div>
			
			<div class="form-group">
				<label>N�mero de sess�es:</label>
				<input type="number" name="numeroSessoes" value="3" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Tipo de restaura��o:</label>
				<input type="text" name="tipoRestauracao" value="Resina" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Tipo de coroa:</label>
				<input type="text" name="tipoCoroa" value="Provis�ria" class="form-control">
			</div>
						
			<button type="submit">Cadastrar</button>
		</form>
	</div>

</body>
</html>