package com.prowings.abstraction;

public class AtmDemo extends ATM {

	@Override
	public boolean changePin(int oldPin, int newPin) {
		System.out.println("Pin is changed successfully");
		return true;
	}

	public static void main(String[] args) {
		AtmDemo obj = new AtmDemo();
		obj.changePin(12, 20);
		
		int currentBal=obj.showBal(12, 17780) ;
		System.out.println(currentBal);
		
		boolean AmtWithdraw=obj.withdraw(12, 17780, 2000);
		System.out.println(AmtWithdraw);
	}
}
