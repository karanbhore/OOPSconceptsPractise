package com.prowings.interface1;

public class Demo5 extends Demo3{

	@Override
	public String m3() {
System.out.println("Inside m3 in Demo5");
		return null;
	}
	public static void main(String[] args) {
		Demo5 obj =new Demo5();
		obj.m1();
		obj.m2();
		obj.m3();
//		obj.main(args);
	}

}
