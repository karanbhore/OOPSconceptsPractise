package com.prowings.inheritance.aggregation;

import java.util.List;

public class Institute {

	String instituteName;
	private List<Department> departments;

	public Institute(String instituteName, List<Department> departments) {
		super();
		this.instituteName = instituteName;
		this.departments = departments;
	}

	public int getTotalStudentsinInstitute() {
		int noOfStudents = 0;
		List<Student> Students;
		for (Department dept : departments) {
			Students = dept.getStudents();
			for (Student s : Students) {
				noOfStudents++;
			}
		}

		return noOfStudents;

	}

}
