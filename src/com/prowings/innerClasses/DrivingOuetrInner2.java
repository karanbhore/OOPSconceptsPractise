package com.prowings.innerClasses;

public class DrivingOuetrInner2 {

	public static void main(String[] args) {
		OuterClass2 obj=new OuterClass2();
		OuterClass2.InnerClass2 innerObj=obj.new InnerClass2();
		System.out.println(innerObj.myInnerMethod());
	System.out.println(innerObj.y);
	}
	
	
	
	
	
	
	
}
