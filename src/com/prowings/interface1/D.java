package com.prowings.interface1;

public class D implements C {

	@Override
	public void print() {
		System.out.println("inside print");
	}

	@Override
	public void print2() {
		System.out.println("inside print2");

	}

	@Override
	public void print3() {
		System.out.println("inside print3");

	}

	public static void main(String[] args) {
		D obj = new D();
		obj.print();
		System.out.println("--------------------------------");
		obj.print2();
		System.out.println("--------------------------------");
		obj.print3();
	}
}
