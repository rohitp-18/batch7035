package com.tka.method_1;

public class Task {
	public void printNumber() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public void printNumRange(int from, int to) {
		System.out.println();
		System.out.println("Print number from "+ from +" to "+ to);
		while(from <= to) {
			System.out.println(from);
			from++;
		}
	}
	
	public void printNumOddRange(int from, int to) {
		System.out.println();
		System.out.println("Print odd number from "+ from +" to "+ to);
		while(from <= to) {
			if(from %2 == 0) {
				from ++;
			}
			else {
				System.out.println(from);
				from += 2;
			}
		}
	}
	
	public void numberSquareRange(int from, int to) {
		System.out.println();
		System.out.println("Print square of number from "+ from +" to "+ to);
		while(from <= to) {
			int square = from*from;
			System.out.println(square);
			from++;
		}
	}
	
	
	public void sumOfNumber(int from, int to) {
		System.out.println();
		int sum = 0;
		while(from <= to) {
			sum += from;
			from++;
		}
		System.out.println("Sum of number is : " + sum);
	}
	
	public void productSquareNumber(int from, int to) {
		System.out.println();
		int product = 0;
		while(from <= to) {
			product = (from * from ) * product;
			from++;
		}
		System.out.println("Product of square of number is: "+ product);
	}
}
