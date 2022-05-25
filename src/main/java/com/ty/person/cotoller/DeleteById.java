package com.ty.person.cotoller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Branch;

public class DeleteById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch=entityManager.find(Branch.class, 1);
		
		entityTransaction.begin();
		entityManager.remove(branch);
		entityTransaction.commit();
		System.out.println("recodrs deleted");
	}
}
