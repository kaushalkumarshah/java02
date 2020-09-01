package com.delticom.coredemo.service;

import java.util.ArrayList;
import java.util.List;

import com.delticom.coredemo.model.Student;

public class StudentServiceImpl implements StudentService{

	static List<Student>  slist = new ArrayList<>();
	
	@Override
	public void addStudent(Student s) {
		
		//List<Student>  slist = new ArrayList<>();
		slist.add(s);
		System.out.println("added success===size="+slist.size());
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		return slist;
	}

	@Override
	public void deleteStudent(int index) {
		slist.remove(index);
		System.out.println("Deleted == size="+slist.size());
	}

}
