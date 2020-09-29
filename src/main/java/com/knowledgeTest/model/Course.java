package com.knowledgeTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	
	@Id
	private int idcourse;

	@Column
	private char code;
	
	@Column
	private String courseName;

    public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
	
    public int getIdcourse() {
		return idcourse;
	}

	public void setIdcourse(int idcourse) {
		this.idcourse = idcourse;
	}


}
