package com.prowings.interface1;

public class Demo4 extends Demo3{

	@Override
	public String m3() {
System.out.println("Inside m3 in Demo4");
		return null;
	}
public static void main(String[] args) {
	Demo4 obj =new Demo4();
	obj.m1();
	obj.m2();
	obj.m3();
}
}
