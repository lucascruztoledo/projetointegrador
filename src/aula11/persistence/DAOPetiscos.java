package aula11.persistence;

import java.util.List;

import aula11.model.Petiscos;

public class DAOPetiscos extends DAO{

	public void cadastrar(Petiscos peti) {
		entityManager.getTransaction().begin();
		entityManager.persist(peti);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Petiscos> getLista(){
		return entityManager.createQuery("from Petiscos f").getResultList();
	
	}
	
	public Petiscos visualiza(Integer id) {
		
		return entityManager.find(Petiscos.class, id);
	}
	
	public void atualizar(Petiscos peti) {
		entityManager.getTransaction().begin();
		entityManager.merge(peti);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	

}
