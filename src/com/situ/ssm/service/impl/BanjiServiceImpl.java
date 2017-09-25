package com.situ.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.situ.ssm.dao.BanjiDao;
import com.situ.ssm.dao.StudentDao;
import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IBanjiService;
import com.situ.ssm.service.IStudentService;

@Service
public class BanjiServiceImpl implements IBanjiService{
	@Autowired
	private BanjiDao banjiDao;

	@Override
	public List<Banji> findAll() {
		return banjiDao.findAll();
	}

	@Override
	public void deletById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Banji findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Banji banji) {
		// TODO Auto-generated method stub
		
	}
	
	

}
