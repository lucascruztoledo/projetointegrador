package aula11.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aula11.model.Cliente;
import aula11.persistence.DAOCliente;


@WebServlet("/visualizar_cliente")
public class VisualizarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cliente c = new Cliente();
		c.setId(Integer.parseInt(
				request.getParameter("id")));
		c.setNome(request.getParameter("nome"));
		c.setEndereco(request.getParameter("endereco"));
		c.setTelefone(request.getParameter("telefone"));
		c.setEmail(request.getParameter("email"));
		c.setCidade(request.getParameter("cidade"));
		c.setEstado(request.getParameter("estado"));
		c.setCep(request.getParameter("cep"));
		
		DAOCliente dao = new DAOCliente();
		dao.atualizar(c);
		
		request.setAttribute("servMensagem", "Atualizado!");
		request.getRequestDispatcher("lista-cliente.jsp")
			.forward(request, response);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(
				request.getParameter("id"));
		
		DAOCliente dao = new DAOCliente();
		request.setAttribute("cliente", dao.visualiza(id));
		request.getRequestDispatcher("visualiza-cliente.jsp")
			.forward(request, response);
		
	}

}
