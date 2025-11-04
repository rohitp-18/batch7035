package com.tka.pattern_1;

public class Pattern19 {
	public static void main(String[] args) {
		int len = 5;
		for(int r=1; r<=5; r++) {
			char ch = 'A';
			for(int k=1; k<=(len-r); k++) {
				System.out.print("  ");
			}
			for(int c=1; c<=r; c++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
		
	}
}
