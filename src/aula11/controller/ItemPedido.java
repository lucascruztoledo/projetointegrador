package aula11.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aula11.persistence.DAOCliente;

@WebServlet("/item_cliente")
public class ItemPedido extends  HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOCliente dao = new DAOCliente();
		request.setAttribute("Item", dao.getLista());
		System.out.println(dao.getLista().size());
		request.getRequestDispatcher("Item-cliente.jsp").forward(request, response);
		
	}
	
	

}
