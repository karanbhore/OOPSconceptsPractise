package com.prowings.inheritance;

public class HierarchicalDemo3 extends HierarchicalDemo2 {
	int c = 3;
	int sum = a + b + c;

	public void display() {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("a+b+c = " + (a + b + c));

	}
}
