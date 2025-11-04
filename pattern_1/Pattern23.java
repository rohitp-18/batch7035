package com.tka.pattern_1;

public class Pattern23 {
	public static void main(String[] args) {
		int len = 5;
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=5; c++) {
				if(c == 1 || r == 1 || r == len || c == len) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
