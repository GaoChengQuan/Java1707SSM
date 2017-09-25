package com.situ.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IStudentService;

@Controller
public class StuController {
	@Autowired
	private IStudentService studentService;

	@RequestMapping(value="/stus/", method = RequestMethod.GET)
	public @ResponseBody List<Student> findAll() {
		List<Student> list = studentService.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
		return list;
	}
	
	@RequestMapping(value="/stus/", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> add(Student student) {
		studentService.add(student);
		Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("student", student);
        dataMap.put("result", "新增用户成功");
        return dataMap;
	}
	
	@RequestMapping(value="/stus/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Object deletById(@PathVariable("id") int id) {
		studentService.deletById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "删除用户成功");
        return map;
	}
	
	@RequestMapping(value="/stus/{id}", method = RequestMethod.GET)
	public @ResponseBody Student findById(@PathVariable("id") int id) {
		Student student = studentService.findById(id);
        return student;
	}
}
