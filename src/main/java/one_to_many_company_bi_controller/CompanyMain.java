package one_to_many_company_bi_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_many_company_bi_dto.Company;
import one_to_many_company_bi_dto.Employee;

public class CompanyMain {
		public static void main(String[] args) {
			Employee employee1=new Employee();
			employee1.setE_id(1);
			employee1.setName("Abc");
			employee1.setSalary(200000);
			employee1.setPhone(79843797);
		
			Employee employee2=new Employee();
			employee2.setE_id(2);
			employee2.setName("xyz");
			employee2.setSalary(899990);
			employee2.setPhone(489835983948l);
			
			Employee employee3=new Employee();
			employee3.setE_id(3);
			employee3.setName("pqr");
			employee3.setSalary(70000);
			employee3.setPhone(88838382);
			
			Company company=new Company();
			company.setC_id(111);
			company.setName("Test yantra");
			company.setGst("A12");
			
			List<Employee>employees=new ArrayList<Employee>();
			employees.add(employee1);
			employees.add(employee2);
			employees.add(employee3);
			
			company.setEmployee(employees);
			
			employee1.setCompany(company);
			employee2.setCompany(company);
			employee3.setCompany(company);
			
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(company);
			entityManager.persist(employee1);
			entityManager.persist(employee2);
			entityManager.persist(employee3);
			entityTransaction.commit();
			
			
			
			
			
			
			
			
			
		}
}
