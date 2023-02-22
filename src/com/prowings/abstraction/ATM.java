package com.prowings.abstraction;

public abstract class ATM {

	public boolean withdraw(int pin, int accNo, int enteredAmt) {
		int currentBal=2000;
		if( currentBal<=10000 && enteredAmt<=currentBal) {
			return true;}
			else 
				return false;
		
	}
	public abstract boolean changePin(int oldPin,int newPin);
	
	public int showBal(int pin ,int accNo) {
		int currentBal=123456;
		return currentBal;
	}

}
