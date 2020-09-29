package com.knowledgeTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowledgeTest.model.Course;


public interface CourseDao extends JpaRepository<Course, Integer> {
}
