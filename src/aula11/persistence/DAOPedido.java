package aula11.persistence;

import java.util.List;

import aula11.model.Pedido;

public class DAOPedido extends DAO {
	
	public void cadastrar(Pedido pedi) {
		entityManager.getTransaction().begin();
		entityManager.persist(pedi);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Pedido> getLista(){
		return entityManager.createQuery("from Pedidopedi").getResultList();
	
	}
	
	public Pedido visualiza(Integer id) {
		
		return entityManager.find(Pedido.class, id);
	}
	
	public void atualizar(Pedido pedi) {
		entityManager.getTransaction().begin();
		entityManager.merge(pedi);
		entityManager.getTransaction().commit();
		entityManager.close();
	}


}
