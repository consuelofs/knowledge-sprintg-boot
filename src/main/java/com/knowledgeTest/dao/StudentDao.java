package com.knowledgeTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowledgeTest.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
}
