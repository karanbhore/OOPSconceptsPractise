package com.prowings.inheritance;

public class HierarchicalDemo4 extends HierarchicalDemo2 {
	int d = 4;
	int sum = a + b + d;

	public void display() {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("d: " + d);
		System.out.println("a+b+d = " + (a + b + d));

	}

}
