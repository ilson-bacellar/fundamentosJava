<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Atendimentos</title>
	<style>
      body {
      	background-image: radial-gradient(ellipse, #1397e3, #9eecf8);
      }
     </style>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		<form action="/atendimento/incluir" method="post">
			<h3>Cadastro de Atendimentos</h3>
		
			<div class="form-group">
				<label>Data:</label> 	
				<input type="text" name="data" value="" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Pagamento:</label>
				<div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="pagamento" value="true" class="form-check-input" >
			      </label>
			    </div>
			</div>
			
			<div class="form-group">
				<label>Observações:</label>
				<input type="text" name="obs" value="" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Paciente:</label>
				<select name="paciente.id" class="form-control">
				<c:forEach var="p" items="${pacientes}">
					<option value="${p.id}">${p.nome}</option>
				</c:forEach>
				</select>
			</div>
			
			<div class="form-group">
				<label>Serviços:</label>
			    <div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="caracteristicas" value="De" class="form-check-input" > Developer
			      </label>
			    </div>
			    <div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="caracteristicas" value="An" checked class="form-check-input"> Analista
			      </label>
			    </div>
			    <div class="form-check">
			      <label class="form-check-label">
		        		<input type="checkbox" name="caracteristicas" value="Da" class="form-check-input"> Database
			      </label>
			    </div>
			</div>
						
			<button type="submit">Cadastrar</button>
		</form>
	</div>

</body>
</html>