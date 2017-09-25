package com.situ.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.ssm.pojo.BanjiCourse;
import com.situ.ssm.service.IBanjiCourseService;

@Controller
@RequestMapping("/banjiCourse")
public class BanjiCourseController {
	@Autowired
	private IBanjiCourseService banjiCourseService;

	@RequestMapping("/findAll")
	public @ResponseBody List<BanjiCourse> findAll() {
		List<BanjiCourse> list = banjiCourseService.findAll();
		return list;
	}
}
