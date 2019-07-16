package aula11.persistence;

import java.util.List;

import aula11.model.Contato;

public class DAOContato extends DAO{

	public void cadastrar(Contato cont) {
		entityManager.getTransaction().begin();
		entityManager.persist(cont);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Contato> getLista(){
		return entityManager.createQuery("from Endereco ende").getResultList();
	
	}
	
	public Contato visualiza(Integer id) {
		
		return entityManager.find(Contato.class, id);
	}
	
	public void atualizar(Contato cont) {
		entityManager.getTransaction().begin();
		entityManager.merge(cont);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	

}
