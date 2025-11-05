package com.tka.method_1;

import java.util.Scanner;

public class ToDo {
	public void total() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		System.out.println("enter a number: ");
		int b = sc.nextInt();
		int c = a+ b;
		System.out.println("Addtion on two number is "+ c);
	}
	
	public void subtraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		System.out.println("enter a number: ");
		int b = sc.nextInt();
		int c = a-b;
		System.out.println("subtraction on two number is "+ c);
	}
	
	public void multiplication() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		System.out.println("enter a number: ");
		int b = sc.nextInt();
		int c = a*b;
		System.out.println("Multiplication on two number is "+ c);
	}
	
	public void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		System.out.println("enter a number: ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("Division on two number is "+ c);
	}
	
	public void modules() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		System.out.println("enter a number: ");
		int b = sc.nextInt();
		int c = a% b;
		System.out.println("Modulation on two number is "+ c);
	}
}
