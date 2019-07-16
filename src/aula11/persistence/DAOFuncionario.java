package aula11.persistence;

import java.util.List;

import aula11.model.Funcionario;


public class DAOFuncionario extends DAO {

	public void cadastrar(Funcionario func) {
		entityManager.getTransaction().begin();
		entityManager.persist(func);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Funcionario> getLista(){
		return entityManager.createQuery("from Funcionario f").getResultList();
	
	}
	
	public Funcionario visualiza(Integer id) {
		
		return entityManager.find(Funcionario.class, id);
	}
	
	public void atualizar(Funcionario funcionario) {
		entityManager.getTransaction().begin();
		entityManager.merge(funcionario);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}



