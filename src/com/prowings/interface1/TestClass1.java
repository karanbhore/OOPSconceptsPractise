package com.prowings.interface1;

public class TestClass1 {
	public static void main(String[] args) {
		Subclass1 obj1 = new Subclass1();
		SubClass2 obj2 = new SubClass2();
		SubClass3 obj3 = new SubClass3();

		System.out.println("parentNum * childNum = " + obj1.parentNum * obj1.childNum);
		System.out.println("------------------------------------");
		System.out.println("parentNum * childNum = " + obj2.parentNum * obj2.childNum2);
		System.out.println("------------------------------------");
		System.out.println("parentNum * childNum = " + obj3.parentNum * obj3.childNum3);
	}
}
