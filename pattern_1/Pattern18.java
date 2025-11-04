package com.tka.pattern_1;

public class Pattern18 {
	public static void main(String[] args) {
		int len = 5;
		for(int r=1; r<=5; r++) {
			for(int k=1; k<=(len-r); k++) {
				System.out.print("  ");
			}
			for(int c=1; c<=r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
