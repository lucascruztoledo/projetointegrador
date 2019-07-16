package aula11.persistence;

import java.util.List;

import aula11.model.Reserva;

public class DAOReserva extends DAO {
	
	public void cadastrar(Reserva res) {
		entityManager.getTransaction().begin();
		entityManager.persist(res);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Reserva> getLista(){
		return entityManager.createQuery("from Reserva res").getResultList();
	
	}
	
	public Reserva visualiza(Integer id) {
		
		return entityManager.find(Reserva.class, id);
	}
	
	public void atualizar(Reserva res) {
		entityManager.getTransaction().begin();
		entityManager.merge(res);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	

}
