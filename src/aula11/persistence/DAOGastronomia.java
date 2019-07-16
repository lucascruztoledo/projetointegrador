package aula11.persistence;

import java.util.List;

import aula11.model.Gastronomia;

public class DAOGastronomia  extends DAO{
	
	public void cadastrar(Gastronomia gastro) {
		entityManager.getTransaction().begin();
		entityManager.persist(gastro);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Gastronomia> getLista(){
		return entityManager.createQuery("from Gastronomia f").getResultList();
	
	}
	
	public Gastronomia visualiza(Integer id) {
		
		return entityManager.find(Gastronomia.class, id);
	}
	
	public void atualizar(Gastronomia gastro) {
		entityManager.getTransaction().begin();
		entityManager.merge(gastro);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
