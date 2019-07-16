package aula11.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Estoque implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private static final long serialVersionUID = 1L;
	private String IdEstoque;
	private Integer QtdEntrada;
	private Integer QtdSaida;
	private Date DateValidade;
	public String getIdEstoque() {
		return IdEstoque;
	}
	public void setIdEstoque(String idEstoque) {
		IdEstoque = idEstoque;
	}
	public Integer getQtdEntrada() {
		return QtdEntrada;
	}
	public void setQtdEntrada(Integer qtdEntrada) {
		QtdEntrada = qtdEntrada;
	}
	public Integer getQtdSaida() {
		return QtdSaida;
	}
	public void setQtdSaida(Integer qtdSaida) {
		QtdSaida = qtdSaida;
	}
	public Date getDateValidade() {
		return DateValidade;
	}
	public void setDateValidade(Date dateValidade) {
		DateValidade = dateValidade;
	}
	@Override
	public String toString() {
		return "Estoque [IdEstoque=" + IdEstoque + ", QtdEntrada=" + QtdEntrada + ", QtdSaida=" + QtdSaida
				+ ", DateValidade=" + DateValidade + "]";
	}

}
