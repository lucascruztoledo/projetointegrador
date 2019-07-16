package aula11.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aula11.model.Funcionario;
import aula11.persistence.DAOFuncionario;

@WebServlet("/cadastrar_funcionario")
public class CadastrarFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		try{
			// Transforma os dados do formulario em um objeto Cliente
			// sempre utilize get/set
			//request.getparameter ->recupera um dado no formulario
			// pelo "name"
			Funcionario func = new Funcionario();
			func.setNome(request.getParameter("nome"));
			func.setMatricula(request.getParameter("matricula"));
			func.setTelefone(request.getParameter("telefone"));
			func.setEmail(request.getParameter("email"));
			//DAO -> cadastra o objeto funcionario(func) no banco
			DAOFuncionario dao = new DAOFuncionario();
			dao.cadastrar(func);
			//caso tenha cadastrado, envia uma mensagem de confirmação
			// {$servMensagem} deve ser utilizado na página jsp
			request.setAttribute("servMensagem", "Cadastrado!");
			//
		}catch(Exception e) {
			 e.printStackTrace();
			request.setAttribute("servMensagem", "Erro!");
		}
		request.getRequestDispatcher("form-funcionario.jsp").forward(request, response);
	}

}
