package aula11.persistence;

import java.util.List;

import aula11.model.Pedido;
import aula11.model.PratoPricipal;

public class DAOPratoPrincipal extends DAO{
	

	public void cadastrar(PratoPricipal princ) {
		entityManager.getTransaction().begin();
		entityManager.persist(princ);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<PratoPricipal> getLista(){
		return entityManager.createQuery("from Prato Principal").getResultList();
	
	}
	
	public PratoPricipal visualiza(Integer id) {
		
		return entityManager.find(PratoPricipal.class, id);
	}
	
	public void atualizar(PratoPricipal princ) {
		entityManager.getTransaction().begin();
		entityManager.merge(princ);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
