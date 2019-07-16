package aula11.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

@Entity
public class Reserva implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeRerva;
	private Double qdtPessoa;
	private String dataReserva;
	
	public Reserva() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeRerva() {
		return nomeRerva;
	}

	public void setNomeRerva(String nomeRerva) {
		this.nomeRerva = nomeRerva;
	}

	public Double getQdtPessoa() {
		return qdtPessoa;
	}

	public void setQdtPessoa(Double qdtPessoa) {
		this.qdtPessoa = qdtPessoa;
	}

	public String getDataReserva() {
		return dataReserva;
	}

	

	public void setDataReserva(String string) {
		this.dataReserva = string;
	}

	public Object setQdtPessoa(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
