package com.prowings.inheritance;

public class MountainBike extends Bicycle {
	int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
		// TODO Auto-generated constructor stub
	}

	public void seatHeight(int newValue) {
		seatHeight = newValue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + " \nseatHeight is : " + seatHeight);
	}

	public static void main(String[] args) {
		MountainBike obj = new MountainBike(4, 50, 10);
		System.out.println(obj.toString());
	}
}
