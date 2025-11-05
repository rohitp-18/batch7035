package com.tka.method_1;

public class Area {
	public void areaCircle(double r) {
		double area = 3.14 * r * r;
		System.out.println("Area of circle is: "+ area);
	}
	
	public void rectangle(double a, double b) {
		double area = a * b;
		System.out.println("Area of rectangle is: "+ area);
	}
	
	public void square(double b) {
		double square = b * b;
		System.out.println("Square of number is: "+ square);
	}
	
	public void cube(double a) {
		double cube = a * a * a;
		System.out.println("Cube of number is: " + cube);
	}
}
