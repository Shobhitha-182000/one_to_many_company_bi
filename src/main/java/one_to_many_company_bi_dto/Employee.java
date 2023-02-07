package one_to_many_company_bi_dto;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Cacheable
public class Employee {
	@Id
	private int e_id;
	private String name;
	private double salary;
	private long phone;
	
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn 
	private Company company;

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", salary=" + salary + ", phone=" + phone + ", company="
				+ company + "]";
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
