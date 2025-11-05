package com.tka.method_1;

import java.util.Scanner;

public class MainClass1 {
	public static void main(String[] args) {
		Task task  = new Task();
		Scanner sc = new Scanner(System.in);
		
		task.printNumber();
		
		System.out.println("enter start of the range: ");
		int from = sc.nextInt();
		System.out.println("enter end of the range: ");
		int to = sc.nextInt();
		
		task.printNumRange(from, to);
		task.printNumOddRange(from, to);
		task.numberSquareRange(from, to);
		task.sumOfNumber(from, to);
		task.productSquareNumber(from, to);
	}
}
