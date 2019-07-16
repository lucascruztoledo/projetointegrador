package aula11.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Gastronomia implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private static final long serialVersionUID = 1L;
	public Integer PratoPrincipal;
	public Integer Bebidas;
	public Integer Peticos;
	public Integer sobrimesas;
	public Integer getPratoPrincipal() {
		return PratoPrincipal;
	}
	public void setPratoPrincipal(Integer pratoPrincipal) {
		PratoPrincipal = pratoPrincipal;
	}
	public Integer getBebidas() {
		return Bebidas;
	}
	public void setBebidas(Integer bebidas) {
		Bebidas = bebidas;
	}
	public Integer getPeticos() {
		return Peticos;
	}
	public void setPeticos(Integer peticos) {
		Peticos = peticos;
	}
	public Integer getSobrimesas() {
		return sobrimesas;
	}
	public void setSobrimesas(Integer sobrimesas) {
		this.sobrimesas = sobrimesas;
	}
	@Override
	public String toString() {
		return "Gastronomia [PratoPrincipal=" + PratoPrincipal + ", Bebidas=" + Bebidas + ", Peticos=" + Peticos
				+ ", sobrimesas=" + sobrimesas + "]";
	}
	
	
}
