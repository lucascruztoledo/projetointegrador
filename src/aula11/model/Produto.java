package aula11.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Produto implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private static final long serialVersionUID = 1L;
	
	private String Idproduto;
	private String NomeProduto;
	private Date ValidadeDoProduto;
	private Integer QntProduto;
	public String getIdproduto() {
		return Idproduto;
	}
	public void setIdproduto(String idproduto) {
		Idproduto = idproduto;
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}
	public Date getValidadeDoProduto() {
		return ValidadeDoProduto;
	}
	public void setValidadeDoProduto(Date validadeDoProduto) {
		ValidadeDoProduto = validadeDoProduto;
	}
	public Integer getQntProduto() {
		return QntProduto;
	}
	public void setQntProduto(Integer qntProduto) {
		QntProduto = qntProduto;
	}
	@Override
	public String toString() {
		return "Produto [Idproduto=" + Idproduto + ", NomeProduto=" + NomeProduto + ", ValidadeDoProduto="
				+ ValidadeDoProduto + ", QntProduto=" + QntProduto + "]";
	}
	
	
	
	
	
	

}
