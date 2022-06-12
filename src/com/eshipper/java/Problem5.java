package com.eshipper.java;

import java.util.Scanner;

/**
 * @author Kunal
 */

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Salary : ");
		float salary = sc.nextFloat();
		float tax = 0;
		if (salary < 250000)
			System.out.println("no Income tax " + tax);
		else if (salary > 250000 && salary < 500000) {
			tax = 10 * (salary - 250000) / 100;
			System.out.println(tax);
		} else if (salary > 500000 && salary < 1000000) {
			tax = (10 * (500000 - 250000) / 100) + (20 * (salary - 500000) / 100);
			System.out.println(tax);
		} else if (salary > 1000000) {
			tax = (10 * (500000 - 250000) / 100) + (20 * (1000000 - 500000) / 100) + (30 * (salary - 1000000) / 100);
			System.out.println(tax);
		}
	}

}
