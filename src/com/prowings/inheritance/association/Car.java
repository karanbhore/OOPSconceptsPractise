package com.prowings.inheritance.association;

final class Car {

	private final Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public void move() {
		engine.work();
		System.out.println("car is moving");
	}

	public static void main(String[] args) {
		Engine engine = new Engine();

		Car car = new Car(engine);
		car.move();
	}

}
