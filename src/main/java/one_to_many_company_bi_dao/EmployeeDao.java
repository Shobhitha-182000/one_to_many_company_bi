package one_to_many_company_bi_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import one_to_many_company_bi_dto.Employee;

public class EmployeeDao {
		public EntityManager getEntityManager() {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
			return entityManagerFactory.createEntityManager();
			
		}
		
		//to save
		public void saveEmployee(Employee employye) {
			EntityTransaction entityTransaction=getEntityManager().getTransaction();
			entityTransaction.begin();
			getEntityManager().persist(employye);
			entityTransaction.commit();
		}
		
		//to update
		public void updateEmployee(Employee employee,int e_id) {
			EntityTransaction entityTransaction=getEntityManager().getTransaction();
			entityTransaction.begin();
			
			Employee rcvEmployee=getEntityManager().find(Employee.class, e_id);
			rcvEmployee.setE_id(e_id);
			getEntityManager().merge(rcvEmployee);
			entityTransaction.commit();
		}
		
		//to remove
		public void removeEmployee(int e_id) {
			EntityTransaction entityTransaction=getEntityManager().getTransaction();
			entityTransaction.begin();
			
			Employee employee=getEntityManager().find(Employee.class, e_id);
			if(employee!=null) {
			employee.setE_id(e_id);
			getEntityManager().remove(employee);
			entityTransaction.commit();
			}
			else 
				System.out.println("invalid");
		}
		
		//to get one
		public Employee getOneEmp(int e_id) {
			EntityTransaction entityTransaction=getEntityManager().getTransaction();
			
			Employee employee=getEntityManager().find(Employee.class, e_id);
			return employee;
		}
		
		//getAll
		public List<Employee> getAllEmployees(){
			EntityTransaction entityTransaction=getEntityManager().getTransaction();
			Query query=getEntityManager().createQuery("select e from Employee e");
			List<Employee> employees=query.getResultList();
			return employees;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
