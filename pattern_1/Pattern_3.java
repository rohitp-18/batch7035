package com.tka.pattern_1;

public class Pattern_3 {
	public static void main(String[] args) {
		for(int r=1; r<=5; r++) {
			for(int c=0; c<5; c++) {
				char ch = (char) (c + 'A');
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}
