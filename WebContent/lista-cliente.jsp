<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Lista de Cliente</title>
</head>
<body>

	<jsp:include page="includes/menu.jsp"></jsp:include>
	<div class="container">
		<jsp:useBean id="dao" class="aula11.persistence.DAOCliente"></jsp:useBean>
		<form method="post" action ="CadastrarCliente.jsp">
		<table class="table">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">NOME</th>
				<th scope="col">ENDERECO</th>
				<th scope="col">TELEFONE</th>
				<th scope="col">EMAIL</th>
				<th scope="col">CIDADE</th>
				<th scope="col">ESTADO</th>
				<th scope="col">CEP</th>
			
			</tr>
		<c:forEach var="c" items="${dao.lista}">
			<tr>
			<td>${c.id}</td>
			<td>${c.nome}</td>
			<td>${c.endereco}</td>
			<td>${c.telefone}</td>
			<td>${c.email}</td>
			<td>${c.cidade}</td>
			<td>${c.estado}</td>
			<td>${c.cep}</td>
			<th><a href="VisualizarCliente?id=${c.id}">ATUALIZAR</a></th>
			<th><a href="ExcluirCliente?id=${c.id}">EXCLUIR</a></th>
			</tr>
		</c:forEach>
		
		</table>
	</form>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>