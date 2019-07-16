package aula11.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aula11.model.Reserva;
import aula11.persistence.DAOReserva;

@WebServlet("/abrir_formreserva")
public class AbrirFormReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			
			Reserva res = new Reserva();
			res.setNomeRerva(request.getParameter("nome reserva"));
			((ServletRequest) res.setQdtPessoa(request)).getParameter(request.getParameter("Quantidade "));
			res.setDataReserva(request.getParameter("Data Reserva"));
			
			
			DAOReserva dao = new DAOReserva();
			dao.cadastrar(res);
			
			request.setAttribute("servMensagem", "Reserva Obtida com Sucesso!!!");
			
		}catch(Exception e) {
			 e.printStackTrace();
			request.setAttribute("servMensagem", "Erro!");
		}
		request.getRequestDispatcher("form-reserva.jsp").forward(request, response);
	}
}


