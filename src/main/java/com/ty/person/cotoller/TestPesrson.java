package com.ty.person.cotoller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Pan;
import com.ty.person.dto.Person;

public class TestPesrson {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		
		person.setName("prajwal");
		person.setEmail("pp@gmail.com");
		person.setPhone(6388229933l);
		
		Pan pan=new Pan();
		
		pan.setAddress("rayardoddi  layout");
		pan.setPanNo("PPH123");
		pan.setName("prajwal");
		
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}
}
