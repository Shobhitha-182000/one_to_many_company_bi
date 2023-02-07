package one_to_many_company_bi_dto;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
@Cacheable
public class Company {
	@Id
	private int c_id;
	private String name;
	private String gst;
	
	@OneToMany(mappedBy = "company")
	List<Employee>employee;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Company [c_id=" + c_id + ", name=" + name + ", gst=" + gst + ", employee=" + employee + "]";
	}
	
}
