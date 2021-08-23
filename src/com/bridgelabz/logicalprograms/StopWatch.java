package com.bridgelabz.logicalprograms;

import java.time.Duration;
import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {

		String start, stop;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anything to start :");
		start = sc.next();
		long startTime = System.currentTimeMillis();
		System.out.println("Enter anything to stop :");
		stop = sc.next();
		long finishTime = System.currentTimeMillis();
		long timeElapsed = finishTime-startTime;
		
		System.out.println("Elapse Time : "+timeElapsed+" millisecond");

	}

}
