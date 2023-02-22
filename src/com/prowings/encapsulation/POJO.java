package com.prowings.encapsulation;

public class POJO {
	public static void main(String[] args) {
		Employee obj = new Employee();
		System.out.println("name of employee");
		obj.setName("Rajesh");
		System.out.println(obj.getName());
		System.out.println();
		System.out.println("id of employee");
		obj.setId("123654987");
		System.out.println(obj.getId());
		System.out.println();
		System.out.println("salary of employee");
		obj.setSalary(500000d);
		System.out.println(obj.getSalary());
		System.out.println();
		System.out.println(obj);
	}
}
