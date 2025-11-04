package com.tka.pattern_1;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num > 0) {
			int digit = num % 10;
			
			for(int c=1; c<=4; c++) {
				System.out.print(digit + " ");
			}
			System.out.println();
			num /=10;
		}
	}
}
