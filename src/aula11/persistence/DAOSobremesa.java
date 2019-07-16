package aula11.persistence;

import java.util.List;

import aula11.model.Sobrimesa;

public class DAOSobremesa extends DAO {
	
	

	public void cadastrar(Sobrimesa sobri) {
		entityManager.getTransaction().begin();
		entityManager.persist(sobri);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Sobrimesa> getLista(){
		return entityManager.createQuery("from Sobrimesa sobri").getResultList();
	
	}
	
	public Sobrimesa visualiza(Integer id) {
		
		return entityManager.find(Sobrimesa.class, id);
	}
	
	public void atualizar(Sobrimesa sobri) {
		entityManager.getTransaction().begin();
		entityManager.merge(sobri);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
