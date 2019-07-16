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
<link rel="stylesheet" href="estilo.css">
    <title>Hello, world!</title>
  </head>

<body>

<jsp:include page="includes/menu.jsp"></jsp:include>

<div class="container">
<h1> Cadastro de Cliente</h1>

<form method="post" action ="CadastrarCliente">
 
 <div class="form-group">
 <label>Nome:</label>
 <input name="nome" type="text" class="form-control" /> 
 </div>
 <div class="form-group">
 <label>Endereco:</label>
 <input name="endereco" type="text" class="form-control" /> 
 </div>
 
 <div class="form-group">
 <label>Telefone:</label>
 <input name="telefone" type="text" class="form-control" /> 
 </div>
 
 <div class="form-group">
 <label>Email:</label>
 <input name="email" type="text" class="form-control"/> 
 </div>
 
 <div class="form-group">
 <label>Cidade:</label>
 <input name="cidade" type="text" class="form-control"/> 
 </div>
 
 <div class="form-group">
 <label>Estado:</label>
 <input name="estado" type="text" class="form-control"/> 
 </div>
 
 <div class="form-group">
 <label>Cep:</label>
 <input name="cep" type="text" class="form-control"/> 
 </div>
 
 
 <center><input type="submit" value="Enviar" /></center>

</form>
${servMensagem}
