package com.eshipper.java;

import java.util.Arrays;

/**
 * @author Kunal
 */
public class Problem10 {

	public static void main(String[] args) {
		int[] list1 = { 1, 45, 76, 99, 12, 48, 12, 55, 100, 111 };
		Arrays.sort(list1);
		System.out.println(list1[list1.length - 2]);
	}
}
