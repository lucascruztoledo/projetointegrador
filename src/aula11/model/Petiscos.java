package aula11.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Petiscos implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private static final long serialVersionUID = 1L;
	
	public String PasteisDeQueijo;
	public String CarneSeca;
	public String BolinhoDeBacalhau;
	public String EspetinhoDefrango;
	public String Filezinho;
	public String CamaraoEmpanado;
	public String TabuaDeFrios;
	public String ChapaNordestina;
	public String getPasteisDeQueijo() {
		return PasteisDeQueijo;
	}
	public void setPasteisDeQueijo(String pasteisDeQueijo) {
		PasteisDeQueijo = pasteisDeQueijo;
	}
	public String getCarneSeca() {
		return CarneSeca;
	}
	public void setCarneSeca(String carneSeca) {
		CarneSeca = carneSeca;
	}
	public String getBolinhoDeBacalhau() {
		return BolinhoDeBacalhau;
	}
	public void setBolinhoDeBacalhau(String bolinhoDeBacalhau) {
		BolinhoDeBacalhau = bolinhoDeBacalhau;
	}
	public String getEspetinhoDefrango() {
		return EspetinhoDefrango;
	}
	public void setEspetinhoDefrango(String espetinhoDefrango) {
		EspetinhoDefrango = espetinhoDefrango;
	}
	public String getFilezinho() {
		return Filezinho;
	}
	public void setFilezinho(String filezinho) {
		Filezinho = filezinho;
	}
	public String getCamaraoEmpanado() {
		return CamaraoEmpanado;
	}
	public void setCamaraoEmpanado(String camaraoEmpanado) {
		CamaraoEmpanado = camaraoEmpanado;
	}
	public String getTabuaDeFrios() {
		return TabuaDeFrios;
	}
	public void setTabuaDeFrios(String tabuaDeFrios) {
		TabuaDeFrios = tabuaDeFrios;
	}
	public String getChapaNordestina() {
		return ChapaNordestina;
	}
	public void setChapaNordestina(String chapaNordestina) {
		ChapaNordestina = chapaNordestina;
	}
	@Override
	public String toString() {
		return "Petiscos [PasteisDeQueijo=" + PasteisDeQueijo + ", CarneSeca=" + CarneSeca + ", BolinhoDeBacalhau="
				+ BolinhoDeBacalhau + ", EspetinhoDefrango=" + EspetinhoDefrango + ", Filezinho=" + Filezinho
				+ ", CamaraoEmpanado=" + CamaraoEmpanado + ", TabuaDeFrios=" + TabuaDeFrios + ", ChapaNordestina="
				+ ChapaNordestina + "]";
	}

}
