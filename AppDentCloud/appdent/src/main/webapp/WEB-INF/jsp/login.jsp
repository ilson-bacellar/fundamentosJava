<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>AppDent</title>
	 <style>
      body {
      	background-image: url("images/bg11.jpg");
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

	<div class="container">
		<h2>Autentica��o</h2>
		
		<c:if test="${not empty mensagem}">		
			<div class="alert alert-danger">
			  <strong>Aten��o!</strong> ${mensagem}
			</div>		
		</c:if>
		
		<form action="/login" method="post">
		  
		  <div class="form-group">
		    <label>E-mail:</label>
		    <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email" value="ilson@al.infnet.edu.br">
		  </div>

		  <div class="form-group">
		    <label>Senha:</label>
		    <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha" value="ilson@al.infnet.edu.br">
		  </div>
		  
		  <button type="submit" class="btn btn-default" style="background-color:#FFAC1C; border: none; color:black; font-weight: bold; box-shadow:1px 1px 1px black">ACESSAR</button>
		</form>
	</div>

</body>
</html>