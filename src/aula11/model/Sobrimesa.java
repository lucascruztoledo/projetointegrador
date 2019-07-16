package aula11.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Sobrimesa implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static final long serialVersionUID = 1L;
	public String CheesecakeDeAmora;
	public String Torta;
	public String Sorvete;
	public String Petitgateau;
	public String Brownie;
	public String getCheesecakeDeAmora() {
		return CheesecakeDeAmora;
	}
	public void setCheesecakeDeAmora(String cheesecakeDeAmora) {
		CheesecakeDeAmora = cheesecakeDeAmora;
	}
	public String getTorta() {
		return Torta;
	}
	public void setTorta(String torta) {
		Torta = torta;
	}
	public String getSorvete() {
		return Sorvete;
	}
	public void setSorvete(String sorvete) {
		Sorvete = sorvete;
	}
	public String getPetitgateau() {
		return Petitgateau;
	}
	public void setPetitgateau(String petitgateau) {
		Petitgateau = petitgateau;
	}
	public String getBrownie() {
		return Brownie;
	}
	public void setBrownie(String brownie) {
		Brownie = brownie;
	}
	@Override
	public String toString() {
		return "Sobrimesa [CheesecakeDeAmora=" + CheesecakeDeAmora + ", Torta=" + Torta + ", Sorvete=" + Sorvete
				+ ", Petitgateau=" + Petitgateau + ", Brownie=" + Brownie + "]";
	}
	
	
	

}
