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
      	background-image: radial-gradient(ellipse, #1397e3, #056abd);
      	color: white;
       	text-shadow: 1px 1px 1px black;
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
				<select name="paciente" class="form-control">
				<c:forEach var="p" items="${pacientes}">
					<option value="${p.id}">${p.nome}</option>
				</c:forEach>
				</select>
			</div>
			
			<div class="form-group">
				<label>Serviços:</label>
			    <c:forEach var="s" items="${servicos}">
			    	<div class="form-check">
			   		  <label class="form-check-label">
			     	   <input type="checkbox" name="servicos" value="${s.id}" class="form-check-input" > Identificador: ${s.id} | Serviço: ${s.nome} | Descrição: ${s.descricao} 
			     	 </label>
			    	</div>
				</c:forEach>
			</div>
						
			<button type="submit" class="btn btn-default" style="background-color:#FFAC1C; color:black; font-weight: bold; box-shadow:1px 1px 1px black">CADASTRAR</button>
		</form>
	</div>

</body>
</html>