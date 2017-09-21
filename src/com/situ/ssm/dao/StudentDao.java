package com.situ.ssm.dao;

import java.util.List;

import com.situ.ssm.pojo.Student;

public interface StudentDao {
	List<Student> findAll();

	void deletById(int id);
	Student findById(int id);

	void add(Student student);
}
