package com.knowledgeTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	
	@Column
    private String rut;
	
	@Column
    private String name;
	
	@Column
    private String lastName;
	
	@Column
    private int age;
	
	@Column
    private Course course;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
    	
    // adding a simple validation related to rut with Chilean format 
    	if(isValidRut(rut)){
    		this.rut = rut;
    	}
    }

	private boolean isValidRut(String rut) {
	
		boolean isEnabled = false;
		try {
			rut =  rut.toUpperCase();
			rut = rut.replace(".", "");
			rut = rut.replace("-", "");
			int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
		
			char dv = rut.charAt(rut.length() - 1);
		
			int m = 0, s = 1;
			for (; rutAux != 0; rutAux /= 10) {
				s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
			}
			if (dv == (char) (s != 0 ? s + 47 : 75)) {
				isEnabled = true;
			}
	
		} catch (java.lang.NumberFormatException e) {
		} catch (Exception e) {
		}
		return isEnabled;
	}
	

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 18) {
            this.age = age;
        }
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
