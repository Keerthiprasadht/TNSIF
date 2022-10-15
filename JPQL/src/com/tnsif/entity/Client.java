package com.tnsif.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select UPPER(e.name) FROM Employee e");
		List<String> list = q.getResultList();
		for (String e:list) {
			System.out.println("Employee name " +e);
		}

	}

}
