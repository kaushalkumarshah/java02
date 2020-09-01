package com.delticom.coredemo.service;

import java.util.List;

import com.delticom.coredemo.model.Student;

public interface StudentService {
	
	void addStudent(Student s);
	List<Student>  getAllStudents();
	void deleteStudent(int index);

}
