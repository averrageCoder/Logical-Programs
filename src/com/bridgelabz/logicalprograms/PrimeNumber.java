package com.bridgelabz.logicalprograms;

public class PrimeNumber {

	public static void main(String[] args) {

		int i,flag=0;      
		int number=7;       
		if(number==0||number==1){  
			System.out.println(number+" is not prime number");      
		}
		else{  
			for(i=2;i<=number/2;i++){      
				if(number%i==0){      
					System.out.println(number+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { 
				System.out.println(number+" is prime number"); 
			}  
		}
	}

}
