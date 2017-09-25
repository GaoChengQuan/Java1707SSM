package com.situ.ssm.dao;

import java.util.List;

import com.situ.ssm.pojo.BanjiCourse;
import com.situ.ssm.pojo.Student;

public interface BanjiCourseDao {
	List<BanjiCourse> findAll();

	void deletById(int id);
}
