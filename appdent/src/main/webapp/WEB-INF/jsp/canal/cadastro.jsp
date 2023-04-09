<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Serviços de Canal</title>
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
		<form action="/canal/incluir" method="post">
			<h3>Cadastro de Serviços de Canal</h3>
		
			<c:import url="/WEB-INF/jsp/servico/cadastro.jsp" />
			
			<div class="form-group">
				<label>Número de sessões:</label>
				<input type="number" name="numeroSessoes" value="3" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Tipo de restauração:</label>
				<input type="text" name="tipoRestauracao" value="Resina" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Tipo de coroa:</label>
				<input type="text" name="tipoCoroa" value="Provisoria" class="form-control">
			</div>
						
			<button type="submit" class="btn btn-default" style="background-color:#FFAC1C; color:black; font-weight: bold; box-shadow:1px 1px 1px black">CADASTRAR</button>
		</form>
	</div>

</body>
</html>