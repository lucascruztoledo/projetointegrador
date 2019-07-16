package aula11.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aula11.model.Cliente;
import aula11.persistence.DAOCliente;

@WebServlet("/cadastrar_cliente")
public class CadastrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		try{
			
			Cliente client = new Cliente();
			client.setNome(request.getParameter("nome"));
			client.setEndereco(request.getParameter("endereco"));
			client.setTelefone(request.getParameter("telefone"));
			client.setEmail(request.getParameter("email"));
			client.setCidade(request.getParameter("cidade"));
			client.setEstado(request.getParameter("estado"));
			client.setCep(request.getParameter("cep"));
			
			DAOCliente dao = new DAOCliente();
			dao.cadastrar(client);
			
			request.setAttribute("servMensagem", "Cadastrado!");
			
		}catch(Exception e) {
			 e.printStackTrace();
			request.setAttribute("servMensagem", "Erro!");
		}
		request.getRequestDispatcher("form-cliente.jsp").forward(request, response);
	}

}

