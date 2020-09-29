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

import com.knowledgeTest.dao.CourseDao;
import com.knowledgeTest.model.Course;

@RestController
@RequestMapping("courses")
public class CourseRest {
	
	@Autowired
	private CourseDao courseDao; 
	
	@PostMapping("/save")
	public void save(@RequestBody Course course){
		courseDao.save(course);
	}
	
	@GetMapping("/courses/all")
	public List<Course> getCoursesList(){
		return courseDao.findAll();
	}
	
	@DeleteMapping("/courses/{id}")
	public void removeStudentByid(@PathVariable("id") Integer id ) {
		courseDao.deleteById(id);
	}
	
	@PutMapping("/courses/{id}")
	public void updateStudent(@RequestBody Course course) {
		courseDao.save(course);
	}

}
