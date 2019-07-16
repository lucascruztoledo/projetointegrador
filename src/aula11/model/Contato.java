package aula11.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Contato implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static final long serialVersionUID = 1L;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getTelefone() {
		return Telefone;
	}
	public void setTelefone(Integer telefone) {
		Telefone = telefone;
	}
	public String Nome;
	public String Email;
	public Integer Telefone;
	@Override
	public String toString() {
		return "Contato [Nome=" + Nome + ", Email=" + Email + ", Telefone=" + Telefone + "]";
	}
	
	
	

}
