<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Usuários</title>
	<style>
      body {
      	background-image: url("images/bg9.jpg");
      	background-size: cover;
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
       	color: white;
       	text-shadow: 1px 1px 1px black;
      }
     </style>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
	
		<form action="/cep" class="form-inline" method="post">
		
			<label>Consultar CEP:</label> 	
			<input type="text" name="cep" value="20010020" class="form-control">

			<button type="submit" class="btn btn-default btn-sm" style="background-color:#FFAC1C; border: none; color:black; font-weight: bold; box-shadow:1px 1px 1px black">BUSCAR</button>
			
		</form>
		
		<form action="/usuario/incluir" method="post">
			<h3>Cadastro de Usuários</h3>
		
			<div class="form-group">
				<label>Nome:</label> 	
				<input type="text" name="nome" value="Ilson de Bacellar" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Senha:</label>
				<input type="password" name="senha" value="123" class="form-control">
			</div>
			
			<div class="form-group">
				<label>E-mail:</label>
				<input type="email" name="email" value="ilson@al.infnet.edu.br" class="form-control">
			</div>
			
			<c:import url="/WEB-INF/jsp/endereco/cadastro.jsp"/>
						
			<button type="submit" class="btn btn-default" style="background-color:#FFAC1C; border: none; color:black; font-weight: bold; box-shadow:1px 1px 1px black">CADASTRAR</button>
		</form>
	</div>
</body>
</html>