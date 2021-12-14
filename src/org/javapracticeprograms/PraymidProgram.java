package org.javapracticeprograms;

import java.util.Scanner;

public class PraymidProgram {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int value = input.nextInt();
		
		 int row = value;
		
		
		for (int i = 0; i < row; i++) {
			
			for (int j = i; j <=row; j++) {
				
				System.out.print(" ");
				
			}
			for (int k = i+1; k > 0; k--) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		
		
	}

}
