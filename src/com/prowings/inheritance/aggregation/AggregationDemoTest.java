package com.prowings.inheritance.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationDemoTest {

	public static void main(String[] args) {
		Student std1 = new Student("Ram", 10, "CSE");
		Student std2 = new Student("Sham", 11, "CSE");
		Student std3 = new Student("Ramesh", 12, "EE");
		Student std4 = new Student("Suresh", 13, "EE");

		List<Student> CSE_students = new ArrayList<Student>();
		CSE_students.add(std2);
		CSE_students.add(std1);

		List<Student> EE_students = new ArrayList<Student>();
		EE_students.add(std4);
		EE_students.add(std3);

		Department CSE = new Department("CSE", CSE_students);
		Department EE = new Department("EE", EE_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(EE);
		departments.add(CSE);

		Institute obj = new Institute("ICRE", departments);

		System.out.println("total students in institute");

		System.out.println(obj.getTotalStudentsinInstitute());
	}

}
