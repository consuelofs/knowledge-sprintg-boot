package com.knowledgeTest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgeTest.dao.StudentDao;
import com.knowledgeTest.model.Student;

@RestController
@RequestMapping("students")
public class StudentRest {
	
	@Autowired
	private StudentDao studentDao; 
	
	@PostMapping("/save")
	public void save(@RequestBody Student student){
		studentDao.save(student);
	}
	
	@GetMapping("/get")
	public List<Student> getStudentsList(){
		return studentDao.findAll();
	}
	
	@DeleteMapping("/remove/{id}")
	public void removeStudentByid(@PathVariable("id") Integer id ) {
		studentDao.deleteById(id);
	}
	
	@PutMapping("/update")
	public void updateStudent(@RequestBody Student student) {
		studentDao.save(student);
	}

}
