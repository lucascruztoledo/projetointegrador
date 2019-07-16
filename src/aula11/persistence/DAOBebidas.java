package aula11.persistence;

import java.util.List;

import aula11.model.Bebidas;

public class DAOBebidas extends DAO {

	public void cadastrar(Bebidas bebi) {
		entityManager.getTransaction().begin();
		entityManager.persist(bebi);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Bebidas> getLista(){
		return entityManager.createQuery("from Bebidas bebi").getResultList();
	
	}
	
	public Bebidas visualiza(Integer id) {
		
		return entityManager.find(Bebidas.class, id);
	}
	
	public void atualizar(Bebidas bebi) {
		entityManager.getTransaction().begin();
		entityManager.merge(bebi);
		entityManager.getTransaction().commit();
		entityManager.close();
	}


}
