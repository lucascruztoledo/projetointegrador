package aula11.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pedido implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private static final long serialVersionUID = 1L;
	private Integer IdPedido;
	private Integer HorarioPedido;
	private Date DataPedido;
	private Integer NmrPedido;
	public Integer getIdPedido() {
		return IdPedido;
	}
	public void setIdPedido(Integer idPedido) {
		IdPedido = idPedido;
	}
	public Integer getHorarioPedido() {
		return HorarioPedido;
	}
	public void setHorarioPedido(Integer horarioPedido) {
		HorarioPedido = horarioPedido;
	}
	public Date getDataPedido() {
		return DataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		DataPedido = dataPedido;
	}
	public Integer getNmrPedido() {
		return NmrPedido;
	}
	public void setNmrPedido(Integer nmrPedido) {
		NmrPedido = nmrPedido;
	}
	@Override
	public String toString() {
		return "Pedido [IdPedido=" + IdPedido + ", HorarioPedido=" + HorarioPedido + ", DataPedido=" + DataPedido
				+ ", NmrPedido=" + NmrPedido + "]";
	}
	
	
	
	
	

}
