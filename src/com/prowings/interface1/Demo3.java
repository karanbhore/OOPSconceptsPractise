package com.prowings.interface1;

public abstract class Demo3 implements Demo{

	@Override
	public void m1() {
System.out.println("Inside m1 in Demo3");
		
	}

	@Override
	public int m2() {
System.out.println("Inside m2 in Demo3");
		return 0;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	

}
