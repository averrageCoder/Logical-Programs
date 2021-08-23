package com.bridgelabz.logicalprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		 int firstTerm=0,previouTerm=1,currentTerm,i,numberOfterms=10;    
		 System.out.println("Fibonacci Series for "+numberOfterms+" terms.");
		 System.out.print(firstTerm+" "+previouTerm);
		    
		 for(i=2;i<numberOfterms;++i) {    
			 currentTerm=firstTerm+previouTerm;    
			 System.out.print(" "+currentTerm);    
			 firstTerm=previouTerm;    
			 previouTerm=currentTerm;    
		 }  

	}

}
