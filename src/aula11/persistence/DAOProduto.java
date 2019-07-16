package aula11.persistence;

import java.util.List;

import aula11.model.Produto;
import aula11.model.Reserva;


public class DAOProduto extends DAO {
	
	public void cadastrar(Produto prod) {
		entityManager.getTransaction().begin();
		entityManager.persist(prod);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Reserva> getLista(){
		return entityManager.createQuery("from Produto prod").getResultList();
	
	}
	
	public Produto visualiza(Integer id) {
		
		return entityManager.find(Produto.class, id);
	}
	
	public void atualizar(Produto prod) {
		entityManager.getTransaction().begin();
		entityManager.merge(prod);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	

	
	

}
