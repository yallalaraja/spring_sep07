package com.qedge.sep07.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qedge.sep06.model.Student;
public class SpringTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//		Student s1 = ctx.getBean("st1",Student.class);
//		s1.setLastName("Vachadu");
//		s1.setFirstName("Verudu");
//		s1.setStuId("1");
//		System.out.println(s1);
//		
//		Student s2 = ctx.getBean("st2",Student.class);
//		s2.setFirstName("Kadu ");
//		s2.setLastName("Mahaaverudu ");
//		s2.setStuId("2");
//		System.out.println(s2);
//		
//		Student s3 = new Student("3","Raja","Reddy");
//		System.out.println(s3);
//		
//		Student s = ctx.getBean("st1",Student.class);
//		System.out.println(s);
//		
//		Student s4 = ctx.getBean("st4",Student.class);
//		System.out.println(s4);
		
		Student s3 = ctx.getBean("st3",Student.class);
		System.out.println(s3);
		

	}

}
