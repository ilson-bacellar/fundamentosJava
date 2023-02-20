<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de usuário</title>
</head>
<body>
	<div class="container">
		<form action="/usuario/incluir" method="post">
			<h3>Cadastro de Usuário</h3>
		
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
						
			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>