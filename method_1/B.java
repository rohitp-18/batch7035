package com.tka.method_1;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.total(20, 30);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter a number: ");
		int b = sc.nextInt();
		
		demo.total(a, b);
		demo.subtract(a, b);
		demo.multiply(a, b);
		demo.division(a, b);
		demo.modules(a, b);
	}
}
