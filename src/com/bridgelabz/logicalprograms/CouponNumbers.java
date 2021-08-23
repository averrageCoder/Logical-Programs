package com.bridgelabz.logicalprograms;

public class CouponNumbers {

	public static void main(String[] args) {


		int number = 5;
		boolean[] isCollected = new boolean[number];
		int count = 0;
		int distinct = 0;

		while (distinct < number) {
			int value = (int) (Math.random() * number);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}

		System.out.println("Total number of random numbers generated: "+ count);

	}

}
