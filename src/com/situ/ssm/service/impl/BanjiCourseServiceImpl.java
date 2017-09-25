package com.situ.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssm.dao.BanjiCourseDao;
import com.situ.ssm.pojo.BanjiCourse;
import com.situ.ssm.service.IBanjiCourseService;
@Service
public class BanjiCourseServiceImpl implements IBanjiCourseService{
	@Autowired
	private BanjiCourseDao banjiCourseDao;
	
	@Override
	public List<BanjiCourse> findAll() {
		return banjiCourseDao.findAll();
	}

}
