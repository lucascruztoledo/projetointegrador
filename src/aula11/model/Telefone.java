package aula11.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Telefone implements Serializable{
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private static final long serialVersionUID = 1L;
	
	private Integer IdTelefone;
	private Integer Numero;
	public Integer getIdTelefone() {
		return IdTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		IdTelefone = idTelefone;
	}
	public Integer getNumero() {
		return Numero;
	}
	public void setNumero(Integer numero) {
		Numero = numero;
	}
	@Override
	public String toString() {
		return "Telefone [IdTelefone=" + IdTelefone + ", Numero=" + Numero + "]";
	}
	
	
	
	

}
