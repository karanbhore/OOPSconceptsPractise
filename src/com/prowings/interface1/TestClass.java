package com.prowings.interface1;

public class TestClass implements In1 {

	@Override
	public void display() {

		System.out.println("Insisde void method");
	}

	public static void main(String[] args) {
		TestClass obj = new TestClass();

		obj.display();
		System.out.println(a);
	}
}
