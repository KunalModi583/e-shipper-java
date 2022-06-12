package com.eshipper.java;

import java.util.Scanner;

/**
 * @author Kunal
 */
public class Problem9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter two digit: ");
		int number = sc.nextInt();
		if (number > 9 && number < 100) {
			int lastNumber = number % 10;
			int firstNumber = number / 10;
			if ((firstNumber + lastNumber + firstNumber * lastNumber) == number)
				System.out.println("number is special number");
			else
				System.out.println("number is not special number");
		} else
			System.out.println("number is not two digit");
	}

}
