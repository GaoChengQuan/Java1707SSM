package com.situ.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IBanjiService;
import com.situ.ssm.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@InitBinder 
	public void initBinder(WebDataBinder binder) { 
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	    dateFormat.setLenient(false); 
	    binder.registerCustomEditor(Date.class,
	           new CustomDateEditor(dateFormat, true));
	}

	
	@Autowired
	private IStudentService studentService;
	
	@Autowired
	private IBanjiService banjiService;

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
	
	
	@RequestMapping("/getAddPage")
	public String getAddPage(Model model){
		List<Banji> banjiList = banjiService.findAll();
		model.addAttribute("banjiList", banjiList);
		return "student_add";
	}
	
	@RequestMapping("/add")
	public String add(Student student){
		studentService.add(student);
		return "redirect:/student/findAll.action";
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(int id, Model model){
		Student student = studentService.findById(id);
		model.addAttribute("student", student);
		return "student_update";
	}
	
	@RequestMapping("/update")
	public String update(Student student, Model model){
		studentService.update(student);
		return "redirect:/student/findAll.action";
	}
}
