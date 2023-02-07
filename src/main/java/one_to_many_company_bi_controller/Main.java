package one_to_many_company_bi_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import one_to_many_company_bi_dto.Company;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityManager entityManager1=entityManagerFactory.createEntityManager();
		Company company=entityManager.find(Company.class,1);
		Company company1=entityManager1.find(Company.class,1);
	}
}
