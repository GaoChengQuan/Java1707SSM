package com.situ.ssm.dao;

import java.util.List;

import com.situ.ssm.pojo.Banji;

public interface BanjiDao {
	List<Banji> findAll();

	void deletById(int id);
	Banji findById(int id);

	void add(Banji banji);
}
