package com.prowings.encapsulation;

public class Employee {

	String name;
	public String id;
	private double salary;

//	public Employee(String name, String id, double salary) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.salary = salary;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
