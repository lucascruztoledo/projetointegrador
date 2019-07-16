package aula11.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aula11.model.Cliente;
import aula11.persistence.DAOCliente;

@WebServlet("/excluir_cliente")
public class ExcluirCliente extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cliente c = new Cliente();
		c.setId(Integer.parseInt(request.getParameter("id")));
		
		DAOCliente dao = new DAOCliente();
		dao.remove(c);
		
		request.setAttribute("servMensagem", "Cliente Excluído");
		
		request.getRequestDispatcher("lista-cliente.jsp")
			.forward(request, response);
		
	}
	}


