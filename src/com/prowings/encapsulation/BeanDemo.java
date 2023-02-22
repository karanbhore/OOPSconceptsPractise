package com.prowings.encapsulation;

public class BeanDemo {

	public static void main(String[] args) {
		BeanDemo obj = new BeanDemo();
		obj.setProperty(789456123);
		System.out.println(obj.getProperty());
	}

	private Integer property;

	public void setProperty(Integer property) {
		if (property == 0) {
			return;
		}
		this.property = property;
	}

	public Integer getProperty() {
		if (property == 0) {
			return null;
		}

		return property;
	}

}
