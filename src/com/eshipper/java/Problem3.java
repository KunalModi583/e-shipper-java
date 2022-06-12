package com.eshipper.java;

import java.util.Scanner;

/**
 * @author Kunal
 */
public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first Number : ");
		float firstNumber = sc.nextFloat();
		System.out.print("Please enter second Number : ");
		float secondNumber = sc.nextFloat();
		System.out.println((firstNumber > secondNumber ? firstNumber + " is larger then " + secondNumber : secondNumber + " is larger then " + firstNumber));

	}

}
