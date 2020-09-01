package com.delticom.coredemo.view;

import java.util.List;
import java.util.Scanner;

import com.delticom.coredemo.model.Student;
import com.delticom.coredemo.service.StudentService;
import com.delticom.coredemo.service.StudentServiceImpl;

public class RunStudent {
	
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		char	agree = 'n' ;
		/*Static*/
		/* *
		Student s = new Student();
		s.setId("001");
		s.setFname("Kaushal");
		s.setLname("Kumar");
		s.setCollege("IOE");
		s.setAge(40);
		StudentService  si = new StudentServiceImpl();
		si.addStudent(s);
		 * */
		
		
		
		/*Get Input from Keyboard*/
		//Student s = new Student();
		StudentService  si = new StudentServiceImpl();
		
		do {
			
		Student s = new Student();
		System.out.println("Enter your ID: ");
		s.setId(sc.nextInt());
		
		System.out.println("Enter your First Name: ");
		s.setFname(sc.next());
		
		System.out.println("Enter your Last Name: ");
		s.setLname(sc.next());
		
		System.out.println("Enter your Mobile No: ");
		s.setPhone(sc.next());
		
		System.out.println("Enter your College Name: ");
		s.setCollege(sc.next());
		
		 
		
		si.addStudent(s);
		
		System.out.println("Wanna Add more record (y/n):  (default:n)");
		agree = sc.next().charAt(0);
		
		}while(agree == 'y');
		
		System.out.println("All data saved");
		
		List<Student> studentList = si.getAllStudents();
		
		studentList.forEach(s1-> System.out.println(s1.getFname()));
		
		
		System.out.println("Wana delete which record: ");
		si.deleteStudent(sc.nextInt());
		
		
		System.out.println("Final Records: ");
		studentList = si.getAllStudents();
		studentList.forEach(s2-> System.out.println(s2.getFname()));
		
		/*
		 * Home:  add Update Features. 
		 * Please review the code and make better standard way
		 * kaushalkumarshah@gmail.com
		 * */
		
	}

}
