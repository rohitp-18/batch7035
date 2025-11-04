package com.tka.pattern_1;

public class Pattern25 {
	public static void main(String[] args) {
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=5; c++) {
				if(r == 1 || r==5) {
					System.out.print("$ ");
				}
				else if(c == 1 || c==5) {
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
