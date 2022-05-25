package com.ty.person.cotoller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Address;
import com.ty.person.dto.Branch;

public class TestAddressAndBranch {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch=new Branch();
		branch.setName("gadag");
		branch.setBranchCode("1PP2");
		branch.setPhone(2233442233l);
		
		Address address=new Address();
		address.setStreet("kalasapur load");
		address.setCity("Gadag");
		address.setState("Karnataka");
		address.setCountry("india");
		address.setPincode(112033);
		branch.setAddress(address);
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
	}
}
