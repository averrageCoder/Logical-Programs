package com.bridgelabz.logicalprograms;

public class ReverseOfNumber {

	public static void main(String[] args) {

		int number = 25689, reverse = 0; 
		System.out.print("The reverse of "+number+" is: "); 
		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.print(reverse);  

	}

}
