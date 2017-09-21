package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IStudentService;
import com.situ.ssm.service.impl.StudentServiceImpl;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Resource(name="studentService")
	private IStudentService studentService;

	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<Student> list = studentService.findAll();
		model.addAttribute("list", list);
		for (Student student : list) {
			System.out.println(student);
		}
		return "student_list";
	}
	
	@RequestMapping("/deletById")
	public String deletById(int id) {
		studentService.deletById(id);
		return "redirect:/student/findAll.action";
	}
}
