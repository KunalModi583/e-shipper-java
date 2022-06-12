package com.eshipper.java;

/**
 * @author Kunal
 */

public class Problem4 {

	public static void main(String[] args) {
//		double []set= {17.4,  21.1,  39.7,  48.0};
//		double []set= {10.7};
		double[] set = { 1.0, 2.0, 3.0 };
//		double []set= {-957.0,  -493.0,  -384.0,  -268.0,  -131.0};
		int len = set.length;
		double meadian = 0;
		System.out.println(len);

		if (len <= 0) {
			System.out.println("-1");
		} else if (len % 2 == 0) {
			meadian = (set[(len / 2) - 1] + set[(len / 2)]) / 2;
		} else {
			meadian = set[((len + 1) / 2) - 1];
		}
		System.out.println(String.format("%.2f", meadian));
	}
}
