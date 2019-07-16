package aula11.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcular")
public class Calcular extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		try {
		String nome = request.getParameter("nome");
		Double n1 = Double.parseDouble(request.getParameter("n1"));
		Double n2 = Double.parseDouble(request.getParameter("n2"));
		Double total = n1 + n2;
		
		response.getWriter().append("<html>");
		response.getWriter().append("<body>");
		response.getWriter().append("Olá Mundo <br/>");
		response.getWriter().append("Nome: " + nome);
		response.getWriter().append("<br/> Total: " + total );
		response.getWriter().append("</html>");
		
		}catch(NullPointerException e){
			
			response.getWriter().append("<html>");
			response.getWriter().append("<body>");
			response.getWriter().append("Dados inválidos.");
			response.getWriter().append("</html>");
			
		}catch(Exception e){
			
			response.getWriter().append("<html>");
			response.getWriter().append("<body>");
			response.getWriter().append("Erro, tente mais tarde!");
			response.getWriter().append("</html>");
			
		}
	}

}
