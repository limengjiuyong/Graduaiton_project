package com.example.demo.controller;


import java.util.ArrayList;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.enity.student;


@Controller
public class indedxController {

	student stu =new student("李萌", 1725121014, "大四", "软件工程", "计算机");
	List <String> course=new ArrayList<>();
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/info")
	public ModelAndView register() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("student",stu);
		mv.setViewName("stuInfo");
		return mv;
		
	}
	@RequestMapping("/select")
	public String select() {
		return "select";
	}
	@RequestMapping("/success")
    @ResponseBody
	public String success(@RequestParam String[] checkID) {//获取前台数数组
        course.clear();
        for(String str:checkID)
        {
        	course.add(str);
        }
		return "选课成功";
	}
	
	@RequestMapping("/success1")
	public ModelAndView success1() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("student", stu);
		mv.addObject("cou", course);
		mv.setViewName("success");
		return mv;
		
	}
	
	
}
