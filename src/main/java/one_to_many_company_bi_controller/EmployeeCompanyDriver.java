package one_to_many_company_bi_controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import one_to_many_company_bi_dao.EmployeeDao;
import one_to_many_company_bi_dto.Company;
import one_to_many_company_bi_dto.Employee;

public class EmployeeCompanyDriver {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			EmployeeDao dao=new EmployeeDao();
			
			boolean exit=true;
			do {
				System.out.println("do you want 1.save employees and company");
				int select=scanner.nextInt();
				switch (select) {
				case 1:{
							System.out.println("enter the company id");
							int c_id=scanner.nextInt();
							
							System.out.println("enter the company name");
							String c_name=scanner.next();
							
							System.out.println("enter the gst");
							String gst=scanner.next();
							
							Company company=new Company();
							company.setC_id(c_id);
							company.setName(c_name);
							company.setGst(gst);
						boolean exit1=true;
							do {
								System.out.println("do you want to add employee 1.add employee 2.exit");
								int choose=scanner.nextInt();
									switch (choose) {
									case 1:{
												System.out.println("enter the employee id");
												int e_id=scanner.nextInt();
												
												System.out.println("enter the employee name");
												String name=scanner.next();
												
												System.out.println("enter the employee phone number");
												long phone=scanner.nextLong();
												
												System.out.println("enter the salary");
												double salary=scanner.nextDouble();
												
												Employee employee=new Employee();
												employee.setE_id(e_id);
												employee.setName(name);
												employee.setPhone(phone);
												employee.setSalary(salary);
												
												List<Employee>employees=new ArrayList<Employee>();
												employees.add(employee);
												
												company.setEmployee(employees);
												employee.setCompany(company);
				
												
												//dao.saveEmployee(employee);
												dao.saveEmployee(employee);
												
										
										
									}break;
									
									case 2:{
												exit1=false;
												System.out.println("Thank you");
										
									}break;
									

									default:
										break;
									}
								
								
								
								
							}while(exit1);
						
				}break;
				case 2:{
					
				}break;

				default:
					break;
				}
			}while(exit);
		}
}
