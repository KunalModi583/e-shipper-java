package com.eshipper.java;

import java.util.Arrays;

/**
 * @author Kunal
 */
public class Problem10 {

	public static void main(String[] args) {
		int[] list1 = { 1, 45, 76, 99, 12, 48, 12, 55, 100 };
		int max = Math.max(list1[0], list1[1]);
		int secondMax = Math.min(list1[0], list1[1]);
		int len = list1.length;
		for (int i = 2; i < len; i++) {
			if (list1[i] > max) {
				secondMax = max;
				max = list1[i];
			} else if (list1[i] > secondMax && max != list1[i]) {
				secondMax = list1[i];
			}
		}
		System.out.println("Second highest number is: " + secondMax);
	}
}
