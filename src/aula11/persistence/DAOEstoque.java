package aula11.persistence;

import java.util.List;

import aula11.model.Estoque;



public class DAOEstoque extends DAO {

	public void cadastrar(Estoque esto) {
		entityManager.getTransaction().begin();
		entityManager.persist(esto);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Estoque> getLista(){
		return entityManager.createQuery("from Estoque esto").getResultList();
	
	}
	
	public Estoque visualiza(Integer id) {
		
		return entityManager.find(Estoque.class, id);
	}
	
	public void atualizar(Estoque prod) {
		entityManager.getTransaction().begin();
		entityManager.merge(prod);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
