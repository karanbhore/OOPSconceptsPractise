package com.prowings.innerClasses;

public class DrivingOuterInner1 {

	public static void main(String[] args) {
//		OuterClass1 obj=new OuterClass1();

		OuterClass1.InnerClass1 innerObj = new OuterClass1.InnerClass1();
		System.out.println(innerObj.y);

	}
}
