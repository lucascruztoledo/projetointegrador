package aula11.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Endereco implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static final long serialVersionUID = 1L;
	
	
	private Integer Rua;
	private String Cidade;
	private String Bairro;
	private Integer complemento;
	private Integer Numero;
	public Integer getRua() {
		return Rua;
	}
	public void setRua(Integer rua) {
		Rua = rua;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public Integer getComplemento() {
		return complemento;
	}
	public void setComplemento(Integer complemento) {
		this.complemento = complemento;
	}
	public Integer getNumero() {
		return Numero;
	}
	public void setNumero(Integer numero) {
		Numero = numero;
	}
	@Override
	public String toString() {
		return "Endereco [Rua=" + Rua + ", Cidade=" + Cidade + ", Bairro=" + Bairro + ", complemento=" + complemento
				+ ", Numero=" + Numero + "]";
	}
	
	
	
	

}
