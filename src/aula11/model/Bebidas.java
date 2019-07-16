package aula11.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Bebidas implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private static final long serialVersionUID = 1L;
	public String CachacaCaipirinhaDoce;
	public String CaipiVodkaEcaipirinhaDoce;
	public String Cerveja;
	public String Champagner;
	public String whiskysImportado;
	public String VodkaNacional;
	public String VodkaImportata;
	public String Tequila;
	public String Licol;
	public String Gin;
	public String Espumante;
	public String getCachacaCaipirinhaDoce() {
		return CachacaCaipirinhaDoce;
	}
	public void setCachacaCaipirinhaDoce(String cachacaCaipirinhaDoce) {
		CachacaCaipirinhaDoce = cachacaCaipirinhaDoce;
	}
	public String getCaipiVodkaEcaipirinhaDoce() {
		return CaipiVodkaEcaipirinhaDoce;
	}
	public void setCaipiVodkaEcaipirinhaDoce(String caipiVodkaEcaipirinhaDoce) {
		CaipiVodkaEcaipirinhaDoce = caipiVodkaEcaipirinhaDoce;
	}
	public String getCerveja() {
		return Cerveja;
	}
	public void setCerveja(String cerveja) {
		Cerveja = cerveja;
	}
	public String getChampagner() {
		return Champagner;
	}
	public void setChampagner(String champagner) {
		Champagner = champagner;
	}
	public String getWhiskysImportado() {
		return whiskysImportado;
	}
	public void setWhiskysImportado(String whiskysImportado) {
		this.whiskysImportado = whiskysImportado;
	}
	public String getVodkaNacional() {
		return VodkaNacional;
	}
	public void setVodkaNacional(String vodkaNacional) {
		VodkaNacional = vodkaNacional;
	}
	public String getVodkaImportata() {
		return VodkaImportata;
	}
	public void setVodkaImportata(String vodkaImportata) {
		VodkaImportata = vodkaImportata;
	}
	public String getTequila() {
		return Tequila;
	}
	public void setTequila(String tequila) {
		Tequila = tequila;
	}
	public String getLicol() {
		return Licol;
	}
	public void setLicol(String licol) {
		Licol = licol;
	}
	public String getGin() {
		return Gin;
	}
	public void setGin(String gin) {
		Gin = gin;
	}
	public String getEspumante() {
		return Espumante;
	}
	public void setEspumante(String espumante) {
		Espumante = espumante;
	}
	@Override
	public String toString() {
		return "Bebidas [CachacaCaipirinhaDoce=" + CachacaCaipirinhaDoce + ", CaipiVodkaEcaipirinhaDoce="
				+ CaipiVodkaEcaipirinhaDoce + ", Cerveja=" + Cerveja + ", Champagner=" + Champagner
				+ ", whiskysImportado=" + whiskysImportado + ", VodkaNacional=" + VodkaNacional + ", VodkaImportata="
				+ VodkaImportata + ", Tequila=" + Tequila + ", Licol=" + Licol + ", Gin=" + Gin + ", Espumante="
				+ Espumante + "]";
	}
	
	

}
