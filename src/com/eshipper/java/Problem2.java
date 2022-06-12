package com.eshipper.java;

import java.util.Scanner;

/**
 * @author Kunal
 */
public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter net pay : ");
		float netPay = sc.nextFloat();
		System.out.print("Please enter Tax Rate : ");
		float taxRate = 1 + sc.nextFloat();
		float grossRate = netPay / taxRate;
		System.out.println(String.format("%.2f", grossRate));

	}

}
