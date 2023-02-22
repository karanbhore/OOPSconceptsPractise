package com.prowings.innerClasses;

import com.prowings.innerClasses.OuterClass.InnerClass;

public class DrivingOuterInner {

	public static void main(String[] args) {
		OuterClass outerObj = new OuterClass();
		OuterClass.InnerClass innerObj = outerObj.new InnerClass();

		System.out.println(innerObj.y + outerObj.x);

	}

}
