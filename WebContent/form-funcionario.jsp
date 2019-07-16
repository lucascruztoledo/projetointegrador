<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>

<body>

<jsp:include page="includes/menu.jsp"></jsp:include>

<div class="container">
<h1> Cadastrar funcionario</h1>

<form method="post" action ="CadastrarFuncionario">
 
 <div class="form-group">
 <label>Nome:</label>
 <input name="nome" type="text" class="form-control" /> 
 </div>
 
 <div class="form-group">
 <label>Matr�cula:</label>
 <input name="matricula" type="text" class="form-control" /> 
 </div>
 
 <div class="form-group">
 <label>Telefone:</label>
 <input name="telefone" type="text" class="form-control" /> 
 </div>
 
 <div class="form-group">
 <label>Email:</label>
 <input name="email" type="text" class="form-control"/> 
 </div>
 
 
 <center><input type="submit" value="Enviar" /></center>

</form>
${servMensagem}

</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>