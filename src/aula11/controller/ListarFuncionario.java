package aula11.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aula11.persistence.DAOFuncionario;


@WebServlet("/listar_funcionario")
public class ListarFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOFuncionario dao = new DAOFuncionario();
		request.setAttribute("lista", dao.getLista());
		System.out.println(dao.getLista().size());
		request.getRequestDispatcher("lista-funcionario.jsp").forward(request, response);
		
	}



}
