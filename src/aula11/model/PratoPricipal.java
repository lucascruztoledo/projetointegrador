package aula11.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PratoPricipal implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static final long serialVersionUID = 1L;
	
	public String Carne;
	public String Massa;
	public String PeixeFutosMar;
	public String Risoto;
	public String Salada;
	public String getCarne() {
		return Carne;
	}
	public void setCarne(String carne) {
		Carne = carne;
	}
	public String getMassa() {
		return Massa;
	}
	public void setMassa(String massa) {
		Massa = massa;
	}
	public String getPeixeFutosMar() {
		return PeixeFutosMar;
	}
	public void setPeixeFutosMar(String peixeFutosMar) {
		PeixeFutosMar = peixeFutosMar;
	}
	public String getRisoto() {
		return Risoto;
	}
	public void setRisoto(String risoto) {
		Risoto = risoto;
	}
	public String getSalada() {
		return Salada;
	}
	public void setSalada(String salada) {
		Salada = salada;
	}
	@Override
	public String toString() {
		return "PratoPricipal [Carne=" + Carne + ", Massa=" + Massa + ", PeixeFutosMar=" + PeixeFutosMar + ", Risoto="
				+ Risoto + ", Salada=" + Salada + "]";
	}
	
	
	

}
