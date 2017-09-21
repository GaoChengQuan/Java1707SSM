package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.pojo.Student;

public interface IStudentService {
	List<Student> findAll();

	void deletById(int id);
	Student findById(int id);

	void add(Student student);
}
