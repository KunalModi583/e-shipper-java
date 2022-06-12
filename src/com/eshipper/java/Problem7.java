package com.eshipper.java;

import java.util.Scanner;

/**
 * @author Kunal
 */
public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter amount : ");
		float amount = sc.nextFloat();
		System.out.print("Please enter yesrs : ");
		int year = sc.nextInt();
		System.out.print("Please enter interestRate : ");
		float interestRate = sc.nextFloat();
		double inflation = ((amount * (Math.pow((1 + interestRate / 100), year)) - amount) * 100) / amount;
		System.out.println("Inflation is " + String.format("%.2f", inflation) + " %");
	}

}
