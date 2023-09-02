package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

@RestController 
public class StudentController {

	@Autowired
	StudentService sser;
	
	@GetMapping("showstucourse")
	public List<Student> getter()
	{
		return sser.showinfo();
	}
	
	@PostMapping("postdetails")
	public List<Student> setter(@RequestBody List<Student> s)
	{
		return sser.putinfo(s);
	}
}
