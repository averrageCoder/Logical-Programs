package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		int i, number, sum = 0 ;
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter any Number: ");
		number = scan.nextInt();

		for(i = 1 ; i < number ; i++) {
			if(number % i == 0)  {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(number+" is a Perfect Number");
		}
		else {
			System.out.println(number+" is NOT a Perfect Number");
		}
	
	}

}
