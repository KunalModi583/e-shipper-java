package com.eshipper.java;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author Kunal 
 */
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number : ");
		int count = 0, number = Math.abs(sc.nextInt());
		while (number % 10 != 0) {
			count = count + 1;
			number = number / 10;
		}
		System.out.println(count);
	}
}
