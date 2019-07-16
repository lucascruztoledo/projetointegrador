package aula11.persistence;

import java.util.List;

import aula11.model.Endereco;

public class DAOEndereco extends DAO{
	
	
	public void cadastrar(Endereco end) {
		entityManager.getTransaction().begin();
		entityManager.persist(end);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Endereco> getLista(){
		return entityManager.createQuery("from Endereco ende").getResultList();
	
	}
	
	public Endereco visualiza(Integer id) {
		
		return entityManager.find(Endereco.class, id);
	}
	
	public void atualizar(Endereco end) {
		entityManager.getTransaction().begin();
		entityManager.merge(end);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	

	

}
