package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	public List<Student> putinfo(List<Student> s)
	{
		return sr.saveAll(s);
	}
	
	public List<Student> showinfo()
	{
		return sr.findAll();
		
	}
	
}
