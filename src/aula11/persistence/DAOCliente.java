package aula11.persistence;

import java.util.List;

import aula11.model.Cliente;



public class DAOCliente extends DAO {

	public void cadastrar(Cliente c) {
		entityManager.getTransaction().begin();
		entityManager.persist(c);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> getLista(){
		return entityManager.createQuery("from Cliente c").getResultList();
	
	}
	
	public Cliente visualiza(Integer id) {
		
		return entityManager.find(Cliente.class, id);
	}
	
	public void atualizar(Cliente c) {
		entityManager.getTransaction().begin();
		entityManager.merge(c);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	public void remove(Cliente c){
    	entityManager.getTransaction().begin();
    	c = entityManager.find(Cliente.class, c.getId());
    	entityManager.remove(c);
    	entityManager.getTransaction().commit();
    }
}