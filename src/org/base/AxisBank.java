package org.base;

public abstract class AxisBank {
	public abstract void savings(String percent);
	public abstract void deposits(String percent, int id);
	public void fixed() {
		System.out.println("Axis Bank fixed is: 10%");

	}
	
}
