package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(110,"anshu",16000);
		EmployeeService es=new EmployeeService();
		String res=es.storeEmloyee(emp);
		System.out.println(res);
		
		
		

	}

}
