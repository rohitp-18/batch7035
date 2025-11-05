package com.tka.method_1;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Area area1 = new Area();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a radius of circle: ");
		double r = sc.nextDouble();
		area1.areaCircle(r);
		System.out.println();
		
		System.out.println("enter a number");
		double a = sc.nextDouble();
		System.out.println("enter a number");
		double b= sc.nextDouble();
		area1.rectangle(a, b);
		
		area1.square(b);
		area1.cube(a);
	}
}
