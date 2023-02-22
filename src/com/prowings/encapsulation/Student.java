package com.prowings.encapsulation;

public class Student {

	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("name of Student :"+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student obj = new  Student("Sham");
		obj.setName("raj");
		System.out.println(obj.getName());
		System.out.println(obj);
	}

}
