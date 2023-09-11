package com.qedge.sep07.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qedge.sep07.dao.EmployeeDao;
import com.qedge.sep07.model.Employee;

public class TestJdbc {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao = ctx.getBean("dao",EmployeeDao.class);
//		Employee emp = new Employee(1,"Ram",20000,"ameerpet");
//		dao.saveEmployee(emp);
		Employee emp3 = new Employee(3,"Raj",30000,"sr nagar");
		dao.saveEmployee(emp3);
	}	
}
