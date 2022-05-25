package com.ty.person.cotoller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Address;
import com.ty.person.dto.Branch;

public class TestById {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager  entityManager=entityManagerFactory.createEntityManager();

		Branch branch=entityManager.find(Branch.class, 1);
		
		System.out.println("Branch Id : "+branch.getId());
		System.out.println("Branch Nme : "+branch.getName());
		System.out.println("Branch Code : "+branch.getBranchCode());
		System.out.println("Branch Phone : "+branch.getPhone());
		
		System.out.println(""+branch.getAddress());
}
}
