package com.tka.pattern_1;

public class Pattern17 {
	public static void main(String[] args) {
		for(int r=1; r<=7; r++) {
			int j = r;
			for(int c=1; c<=7; c++) {				
				System.out.print(j + " ");
				if(j == 7) {
					j =1;
				}else {
					j++;
				}
			}
			System.out.println();
		}
	}
}
