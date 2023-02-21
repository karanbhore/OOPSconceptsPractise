package com.prowings.interface1;

public class Demo1 implements Demo {

	@Override
	public void m1() {
		System.out.println("Inside m1");
	}

	@Override
	public int m2() {
		System.out.println("Inside m2");
		return 0;
	}

	@Override
	public String m3() {
		System.out.println("Inside m3");
		return null;
	}

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
