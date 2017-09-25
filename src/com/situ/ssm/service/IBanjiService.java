package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.pojo.Banji;

public interface IBanjiService {
	List<Banji> findAll();

	void deletById(int id);
	Banji findById(int id);

	void add(Banji banji);
}
