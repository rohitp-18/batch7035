package com.tka.pattern_1;

public class Pattern15 {
	public static void main(String[] args) {
		int len = 5;
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=5; c++) {
				if(len/2+1 == c || len/2+1 == r) {
					System.out.print("$ ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
