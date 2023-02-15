package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Patient;

public class Patientdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Patient p1) {
		entityTransaction.begin();
		entityManager.persist(p1);
		entityTransaction.commit();
	}

	public void update(int pid, String bg) {
		Patient p1 = entityManager.find(Patient.class, pid);
		p1.setBg(bg);
		entityTransaction.begin();
		entityManager.merge(p1);
		entityTransaction.commit();
	}
	
	public void delete(int pid) {
		Patient p1 = entityManager.find(Patient.class, pid);
		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();
	}

}
